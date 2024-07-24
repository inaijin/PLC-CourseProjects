package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private final TypeChecker typeChecker;
    private final ArrayList<String> visited;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private final HashMap<String, Type> funcReturnType;
    private final Stack<String> breakLabels = new Stack<>();
    private final Stack<String> nextLabels = new Stack<>();
    private final HashMap<String, ArrayList<Expression>> funcDefaultVals = new HashMap<>();
    private final HashMap<String, Integer> funcArgCount = new HashMap<>();
    private FileWriter mainFile;
    private int curLabel = 0;

    public CodeGenerator(TypeChecker typeChecker) {
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        this.funcReturnType = typeChecker.funcReturnType;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }

    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }

    private String getLoadCommand(VarItem varItem) {
        String loadCommand = "";
        int index = slotOf(varItem.getName());

        if (!varItem.isArg()) {
            if (varItem.getType() instanceof IntType || varItem.getType().sameType(new BoolType()))
                loadCommand = "iload " + index;
            else
                loadCommand = "aload " + index;
        } else {
            loadCommand = "aload " + index;
            if (varItem.getType().sameType(new IntType())) {
                loadCommand += "\ninvokevirtual java/lang/Integer/intValue()I";
            } else if (varItem.getType().sameType(new BoolType())) {
                loadCommand += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
            }
        }
        return loadCommand;
    }

    private VarItem getItemFromName(String name) {
        SymbolTable symbolTable = SymbolTable.top;

        try {
            return (VarItem) symbolTable.getItem("VAR:" + name);
        } catch (ItemNotFound ignore) {
        }

        return null;
    }

    private <T extends Expression> void processExpression(T genericExpression, String command) {
        if (genericExpression instanceof Identifier) {
            addCommand(getLoadCommand(Objects.requireNonNull(
                    getItemFromName(((Identifier) genericExpression).getName())
            )));
        } else {
            Type genericType = genericExpression.accept(typeChecker);
            addCommand(command);
            if (genericType.sameType(new BoolType())) {
                addCommand("invokevirtual java/lang/Boolean/booleanValue()Z");
            }
        }
    }

    public String getFreshLabel() {
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }

    public String getType(Type element) {
        String type = "";
        switch (element) {
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
            }
        }
        return type;
    }

    private void prepareOutputFolder() {
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try {
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if (files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        } catch (SecurityException ignore) {
        }

        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException ignore) {
        }
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException ignore) {
        }
    }

    private void addCommand(String command) {
        if (command == null)
            return;
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if (command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if (command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException ignore) {
        }
    }

    private void handleMainClass() {
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program) {
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for (String funcName : this.visited) {
            try {
                FunctionItem curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                curFunction.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored) {
            }
        }

        program.getMain().accept(this);
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        SymbolTable.push(new SymbolTable());

        slots.clear();
        slotOf(functionDeclaration.getFunctionName().getName());

        String commands = "";
        ArrayList<VarDeclaration> argDec;
        argDec = functionDeclaration.getArgs();
        StringBuilder args = new StringBuilder();
        ArrayList<Type> argTypes = new ArrayList<>();
        boolean hadReturn = Boolean.FALSE;

        try {
            FunctionItem funcItm = ((FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName()));
            argTypes = funcItm.getArgumentTypes();
        } catch (ItemNotFound ignored) {
        }

        int i = 0;
        ArrayList<Expression> defaultVals = new ArrayList<>();
        for (VarDeclaration varDeclaration : argDec) {
            slotOf(varDeclaration.getName().getName());
            try {
                VarItem argItm = new VarItem(new Identifier(varDeclaration.getName().getName()));
                if (varDeclaration.getDefaultVal() != null) {
                    defaultVals.add(varDeclaration.getDefaultVal());
                    argItm.setType(varDeclaration.getDefaultVal().accept(typeChecker));
                } else {
                    argItm.setType(argTypes.get(i));
                }
                argItm.setIsArg(Boolean.TRUE);
                SymbolTable.top.put(argItm);
                args.append(getType(argTypes.get(i)));
                i += 1;
            } catch (ItemAlreadyExists ignore) {
            }
        }

        funcDefaultVals.put(functionDeclaration.getFunctionName().getName(), defaultVals);
        funcArgCount.put(functionDeclaration.getFunctionName().getName(), i);

        StringBuilder returnType = new StringBuilder();

        if (funcReturnType.get(functionDeclaration.getFunctionName().getName()) == null ||
                funcReturnType.get(functionDeclaration.getFunctionName().getName()) instanceof NoType) {
            returnType.append("V");
        } else if (funcReturnType.get(functionDeclaration.getFunctionName().getName()).sameType(new IntType())) {
            returnType.append("I");
        } else if (funcReturnType.get(functionDeclaration.getFunctionName().getName()).sameType(new BoolType())) {
            returnType.append("Z");
        } else if (funcReturnType.get(functionDeclaration.getFunctionName().getName()).sameType(new StringType())) {
            returnType.append("Ljava/lang/String;");
        } else if (funcReturnType.get(functionDeclaration.getFunctionName().getName()).
                sameType(new ListType(new IntType()))) {
            returnType.append("Ljava/util/List;");
        }

        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += "(" + args + ")" + returnType + "\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";

        addCommand(commands);

        for (Statement stmt : functionDeclaration.getBody()) {
            if (stmt instanceof ReturnStatement returnStatement) {
                returnStatement.accept(this);
                hadReturn = true;
            } else {
                stmt.accept(this);
            }
        }

        if (!hadReturn)
            addCommand("return");

        addCommand(".end method");
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        slots.clear();
        slotOf("MAIN");
        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload 0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        addCommand(commands);
        for (var statement : mainDeclaration.getBody()) {
            statement.accept(this);
        }
        commands = "";
        commands += "return\n";
        commands += ".end method\n";
        addCommand(commands);
        return null;
    }

    @Override
    public String visit(AccessExpression accessExpression) {
        if (accessExpression.isFunctionCall()) {
            return handleFunctionCall(accessExpression);
        } else {
            return handleListAccess(accessExpression);
        }
    }

    private String handleFunctionCall(AccessExpression accessExpression) {
        Identifier functionName = (Identifier) accessExpression.getAccessedExpression();
        ArrayList<Expression> arguments = accessExpression.getArguments();
        SymbolTableItem foundFunc = null;
        SymbolTableItem foundFuncPointer = null;
        Type returnType = new NoType();
        String actualName = "";

        try {
            foundFunc = SymbolTable.root.getItem("Function:" + functionName.getName());
            actualName = functionName.getName();
        } catch (ItemNotFound ignore) {
            try {
                foundFuncPointer = SymbolTable.top.getItem("VAR:" + functionName.getName());
            } catch (ItemNotFound ignore1) {
            }
        }

        if (foundFunc instanceof FunctionItem functionItem) {
            returnType = funcReturnType.get(functionItem.getName());
        }

        if (foundFuncPointer instanceof VarItem varItem) {
            if (varItem.getType() instanceof FptrType fptrType) {
                try {
                    foundFunc = SymbolTable.root.getItem("Function:" + fptrType.getFunctionName());
                    actualName = fptrType.getFunctionName();
                } catch (ItemNotFound ignore) {
                }

                if (foundFunc instanceof FunctionItem functionItem) {
                    returnType = funcReturnType.get(functionItem.getName());
                }
            }
        }

        if (foundFuncPointer == null) {
            FunctionPointer funcPointer = new FunctionPointer(functionName);
            String funcPointerByteCode = funcPointer.accept(this);

            addCommand(funcPointerByteCode);
        } else {
            addCommand("aload " + slotOf(foundFuncPointer.getName()));
        }

        addCommand("new java/util/ArrayList");
        addCommand("dup");
        addCommand("invokespecial java/util/ArrayList/<init>()V");

        int count = 0;
        for (Expression arg : arguments) {
            count += 1;
            addCommand("dup");

            String argByteCode = arg.accept(this);
            Type argType = arg.accept(typeChecker);

            processExpression(arg, argByteCode);

            if (argType.sameType(new IntType())) {
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            } else if (argType.sameType(new BoolType())) {
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            }

            addCommand("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            addCommand("pop");
        }

        if (funcArgCount.get(actualName) != null) {
            if (count < funcArgCount.get(actualName)) {
                ArrayList<Expression> defaultVals = funcDefaultVals.get(actualName);
                if (defaultVals != null) {
                    int diff = defaultVals.size() - (funcArgCount.get(actualName) - count);
                    for (Expression arg : defaultVals) {
                        if (diff != 0) {
                            diff -= 1;
                            continue;
                        }

                        addCommand("dup");

                        String argByteCode = arg.accept(this);
                        Type argType = arg.accept(typeChecker);

                        processExpression(arg, argByteCode);

                        if (argType.sameType(new IntType())) {
                            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
                        } else if (argType.sameType(new BoolType())) {
                            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
                        }

                        addCommand("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
                        addCommand("pop");
                    }
                }
            }
        }

        addCommand("invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;");

        if (returnType instanceof IntType) {
            addCommand("checkcast java/lang/Integer");
            addCommand("invokevirtual java/lang/Integer/intValue()I");
        } else if (returnType instanceof BoolType) {
            addCommand("checkcast java/lang/Boolean");
        } else if (returnType instanceof StringType) {
            addCommand("checkcast java/lang/String");
        }

        return null;
    }

    private String handleListAccess(AccessExpression accessExpression) {
        Expression listExpr = accessExpression.getAccessedExpression();
        ArrayList<Expression> dimensions = accessExpression.getDimentionalAccess();
        Type listType = new NoType();

        String listName = listExpr.accept(this);
        VarItem listItm = getItemFromName(listName);

        if (listItm != null) {
            addCommand(getLoadCommand(listItm));
            if (listItm.getType() instanceof ListType listType1)
                listType = listType1.getType();
        }

        if (!dimensions.isEmpty()) {
            Expression indexExpr = dimensions.getFirst();
            String indexByteCode = indexExpr.accept(this);

            processExpression(indexExpr, indexByteCode);

            addCommand("invokevirtual List/getElement(I)Ljava/lang/Object;");

            if (listType.sameType(new IntType())) {
                addCommand("checkcast java/lang/Integer");
                addCommand("invokevirtual java/lang/Integer/intValue()I");
            } else if (listType.sameType(new BoolType())) {
                addCommand("checkcast java/lang/Boolean");
            } else if (listType.sameType(new StringType())) {
                addCommand("checkcast java/lang/String");
            }
        }

        return null;
    }

    @Override
    public String visit(AssignStatement assignStatement) {
        SymbolTable symbolTable = SymbolTable.top;
        Expression assignExpr = assignStatement.getAssignExpression();
        int index = slotOf(assignStatement.getAssignedId().getName());
        Type assignType = assignExpr.accept(typeChecker);

        if (assignStatement.isAccessList()) {
            String assignedByteCode = assignStatement.getAssignExpression().accept(this);
            String listName = assignStatement.getAssignedId().accept(this);

            processExpression(assignStatement.getAssignExpression(), assignedByteCode);

            if (assignType.sameType(new IntType()))
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            else if (assignType.sameType(new BoolType()))
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");

            VarItem listItm = getItemFromName(listName);
            if (listItm != null) {
                addCommand(getLoadCommand(listItm));
            }

            addCommand("swap");
            String indexExprByteCode = assignStatement.getAccessListExpression().accept(this);
            processExpression(assignStatement.getAccessListExpression(), indexExprByteCode);
            addCommand("swap");
            addCommand("invokevirtual List/setElement(ILjava/lang/Object;)V");

            return null;
        }

        String assignExprByteCode = assignExpr.accept(this);
        String jasminCode;

        if (assignStatement.getAssignOperator() == AssignOperator.PLUS_ASSIGN ||
                assignStatement.getAssignOperator() == AssignOperator.MINUS_ASSIGN ||
                assignStatement.getAssignOperator() == AssignOperator.MULT_ASSIGN ||
                assignStatement.getAssignOperator() == AssignOperator.DIVIDE_ASSIGN ||
                assignStatement.getAssignOperator() == AssignOperator.MOD_ASSIGN) {

            if (assignType.sameType(new IntType())) {
                addCommand("iload " + index);
            } else {
                addCommand("aload " + index);
            }

            processExpression(assignExpr, assignExprByteCode);

            switch (assignStatement.getAssignOperator()) {
                case PLUS_ASSIGN:
                    addCommand("iadd");
                    break;
                case MINUS_ASSIGN:
                    addCommand("isub");
                    break;
                case MULT_ASSIGN:
                    addCommand("imul");
                    break;
                case DIVIDE_ASSIGN:
                    addCommand("idiv");
                    break;
                case MOD_ASSIGN:
                    addCommand("irem");
                    break;
            }
        } else {
            processExpression(assignExpr, assignExprByteCode);
        }

        if (assignType.sameType(new IntType()) || assignType.sameType(new BoolType())) {
            jasminCode = "istore " + index;
        } else {
            jasminCode = "astore " + index;
        }

        VarItem varitem = new VarItem(assignStatement.getAssignedId());
        varitem.setType(assignType);

        try {
            symbolTable.put(varitem);
        } catch (ItemAlreadyExists ignore) {
        }

        addCommand(jasminCode);
        return null;
    }

    @Override
    public String visit(IfStatement ifStatement) {
        String elseLabel = getFreshLabel();
        String endLabel = getFreshLabel();

        for (Expression condition : ifStatement.getConditions()) {
            String conditionByteCode = condition.accept(this);
            processExpression(condition, conditionByteCode);
        }

        addCommand("ifeq " + elseLabel);

        for (Statement stmt : ifStatement.getThenBody()) {
            stmt.accept(this);
        }

        addCommand("goto " + endLabel);
        addCommand(elseLabel + ":");

        for (Statement stmt : ifStatement.getElseBody()) {
            stmt.accept(this);
        }

        addCommand(endLabel + ":");

        return null;
    }

    @Override
    public String visit(PutStatement putStatement) {
        String putExprByteCode = putStatement.getExpression().accept(this);
        Type putExprType = putStatement.getExpression().accept(typeChecker);

        processExpression(putStatement.getExpression(), putExprByteCode);

        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        addCommand("swap");

        if (putExprType.sameType(new IntType())) {
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        } else if (putExprType.sameType(new BoolType())) {
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");
        } else if (putExprType.sameType(new StringType())) {
            addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else if (putExprType.sameType(new ListType(new NoType()))) {
            addCommand("invokevirtual List/toString()Ljava/lang/String;");
            addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else {
            addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V");
        }

        return null;
    }

    @Override
    public String visit(ReturnStatement returnStatement) {
        if (returnStatement.hasRetExpression()) {
            String command = "";
            String returnByteCode = returnStatement.getReturnExp().accept(this);
            Type returnType = returnStatement.getReturnExp().accept(typeChecker);

            processExpression(returnStatement.getReturnExp(), returnByteCode);

            if (returnType.sameType(new IntType()) || returnType.sameType(new BoolType())) {
                command += "ireturn";
            } else {
                command += "areturn";
            }

            addCommand(command);
            return null;
        }
        addCommand("return");
        return null;
    }

    @Override
    public String visit(ExpressionStatement expressionStatement) {
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        String firstOpByteCode = binaryExpression.getFirstOperand().accept(this);
        String secondOpByteCode = binaryExpression.getSecondOperand().accept(this);
        String operator = binaryExpression.getOperator().toString();
        String binaryCommand;
        boolean isComparison = false;

        processExpression(binaryExpression.getFirstOperand(), firstOpByteCode);
        processExpression(binaryExpression.getSecondOperand(), secondOpByteCode);

        switch (operator) {
            case "EQUAL":
                binaryCommand = "if_icmpeq";
                isComparison = true;
                break;
            case "NOT_EQUAL":
                binaryCommand = "if_icmpne";
                isComparison = true;
                break;
            case "GREATER_THAN":
                binaryCommand = "if_icmpgt";
                isComparison = true;
                break;
            case "LESS_THAN":
                binaryCommand = "if_icmplt";
                isComparison = true;
                break;
            case "LESS_EQUAL_THAN":
                binaryCommand = "if_icmple";
                isComparison = true;
                break;
            case "GREATER_EQUAL_THAN":
                binaryCommand = "if_icmpge";
                isComparison = true;
                break;
            case "PLUS":
                binaryCommand = "iadd";
                break;
            case "MINUS":
                binaryCommand = "isub";
                break;
            case "MULT":
                binaryCommand = "imul";
                break;
            case "DIVIDE":
                binaryCommand = "idiv";
                break;
            default:
                binaryCommand = "NOP";
                break;
        }

        if (isComparison) {
            String labelTrue = getFreshLabel();
            String labelEnd = getFreshLabel();

            addCommand(binaryCommand + " " + labelTrue);
            addCommand("iconst_0\ninvokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("goto " + labelEnd);
            addCommand(labelTrue + ":");
            addCommand("iconst_1\ninvokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand(labelEnd + ":");
        } else {
            addCommand(binaryCommand);
        }

        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        String unaryExprByteCode = unaryExpression.getExpression().accept(this);
        String operator = unaryExpression.getOperator().toString();
        int index = -1;

        if (unaryExpression.getExpression() instanceof Identifier identifier) {
            String name = identifier.getName();
            index = slotOf(name);
        }

        processExpression(unaryExpression.getExpression(), unaryExprByteCode);

        if (unaryExpression.getExpression() instanceof AccessExpression accessExpression) {
            if (!accessExpression.isFunctionCall()) {
                Expression listExpr = accessExpression.getAccessedExpression();

                String unaryCommand = switch (operator) {
                    case "NOT" -> "iconst_1\nixor";
                    case "MINUS" -> "ineg";
                    case "INC" -> "iconst_1\niadd";
                    case "DEC" -> "iconst_1\nisub";
                    default -> "NOP";
                };
                String convertCommand = switch (operator) {
                    case "NOT" -> "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
                    case "MINUS", "INC", "DEC" -> "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
                    default -> "NOP";
                };

                addCommand(unaryCommand);
                addCommand("dup");
                addCommand(convertCommand);

                String listName = listExpr.accept(this);
                VarItem listItm = getItemFromName(listName);
                if (listItm != null) {
                    addCommand(getLoadCommand(listItm));
                }
                addCommand("swap");

                String indexExprByteCode = accessExpression.getDimentionalAccess().getFirst().accept(this);
                processExpression(accessExpression.getDimentionalAccess().getFirst(), indexExprByteCode);

                addCommand("swap");
                addCommand("invokevirtual List/setElement(ILjava/lang/Object;)V");

                if (operator.equals("NOT"))
                    addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");

                return null;
            }
        }

        String unaryCommand = switch (operator) {
            case "NOT" -> "iconst_1\nixor";
            case "MINUS" -> "ineg";
            case "INC" -> "iconst_1\niadd\ndup\nistore " + index;
            case "DEC" -> "iconst_1\nisub\ndup\nistore " + index;
            default -> "NOP";
        };
        String convertCommand = switch (operator) {
            case "NOT" -> "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
            case "MINUS", "INC", "DEC" -> "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
            default -> "NOP";
        };
        String popCommand = switch (operator) {
            case "NOT" -> "";
            case "MINUS" -> "invokevirtual java/lang/Integer/intValue()I";
            case "INC", "DEC" -> "pop";
            default -> "NOP";
        };

        addCommand(unaryCommand);
        addCommand(convertCommand);
        if (!popCommand.isEmpty())
            addCommand(popCommand);

        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        SymbolTable symbolTable = SymbolTable.top;
        SymbolTableItem foundItm = null;

        try {
            foundItm = symbolTable.getItem("VAR:" + identifier.getName());
        } catch (ItemNotFound ignore) {
        }

        if (foundItm instanceof VarItem varItem) {
            return varItem.getName();
        }

        return null;
    }

    @Override
    public String visit(LoopDoStatement loopDoStatement) {
        String startLabel = getFreshLabel();
        String endLabel = getFreshLabel();

        breakLabels.push(endLabel);
        nextLabels.push(startLabel);

        addCommand(startLabel + ":");

        for (Statement stmt : loopDoStatement.getLoopBodyStmts()) {
            stmt.accept(this);
        }

        addCommand("goto " + startLabel);
        addCommand(endLabel + ":");

        breakLabels.pop();
        nextLabels.pop();

        return null;
    }

    @Override
    public String visit(BreakStatement breakStatement) {
        addCommand("goto " + breakLabels.peek());
        return null;
    }

    @Override
    public String visit(NextStatement nextStatement) {
        addCommand("goto " + nextLabels.peek());
        return null;
    }

    @Override
    public String visit(LenStatement lenStatement) {
        String lenExprByteCode = lenStatement.getExpression().accept(this);
        Type lenExprType = lenStatement.getExpression().accept(typeChecker);

        processExpression(lenStatement.getExpression(), lenExprByteCode);

        if (lenExprType.sameType(new ListType(new NoType()))) {
            addCommand("invokevirtual List/getSize()I");
        } else if (lenExprType.sameType(new StringType())) {
            addCommand("invokevirtual java/lang/String/length()I");
        }

        return null;
    }

    @Override
    public String visit(ChopStatement chopStatement) {
        addCommand("new java/lang/StringBuilder");
        addCommand("dup");

        String chopStmtByteCode = chopStatement.getChopExpression().accept(this);
        processExpression(chopStatement.getChopExpression(), chopStmtByteCode);

        addCommand("invokespecial java/lang/StringBuilder/<init>(Ljava/lang/String;)V");

        addCommand("dup");
        addCommand("dup");
        addCommand("invokevirtual java/lang/StringBuilder/length()I");
        addCommand("iconst_1");
        addCommand("isub");
        addCommand("invokevirtual java/lang/StringBuilder/setLength(I)V");

        addCommand("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");

        return null;
    }

    @Override
    public String visit(FunctionPointer functionPointer) {
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload 0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }

    @Override
    public String visit(ListValue listValue) {
        int index = slotOf(String.valueOf(listValue.hashCode()));

        addCommand("new java/util/ArrayList");
        addCommand("dup");
        addCommand("invokespecial java/util/ArrayList/<init>()V");
        addCommand("astore " + index);

        for (Expression expr : listValue.getElements()) {
            addCommand("aload " + index);

            String exprByteCode = expr.accept(this);
            Type exprType = expr.accept(typeChecker);

            processExpression(expr, exprByteCode);

            if (exprType.sameType(new IntType())) {
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            } else if (exprType.sameType(new BoolType())) {
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            }

            addCommand("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            addCommand("pop");
        }

        addCommand("aload " + index);
        addCommand("new List");
        addCommand("dup_x1");
        addCommand("swap");
        addCommand("invokespecial List/<init>(Ljava/util/ArrayList;)V");

        return null;
    }

    @Override
    public String visit(IntValue intValue) {
        return "ldc " + intValue.getIntVal();
    }

    @Override
    public String visit(BoolValue boolValue) {
        if (boolValue.getBool())
            return "iconst_1\ninvokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
        return "iconst_0\ninvokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc " + stringValue.getStr();
    }
}
