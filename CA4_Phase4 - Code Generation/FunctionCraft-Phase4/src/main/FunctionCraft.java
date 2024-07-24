package main;

import main.ast.nodes.Program;
import main.compileError.CompileError;
import main.visitor.codeGenerator.CodeGenerator;
import main.visitor.name.NameChecker;
import main.visitor.type.TypeChecker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.FunctionCraftLexer;
import parsers.FunctionCraftParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FunctionCraft {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        FunctionCraftLexer flLexer = new FunctionCraftLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(flLexer);
        FunctionCraftParser flParser = new FunctionCraftParser(tokens);
        Program program = flParser.program().flProgram;
        ArrayList<CompileError> compileErrors = new ArrayList<>();

        NameChecker nameChecker = new NameChecker();
        nameChecker.visit(program);
        nameChecker.nameErrors.sort(Comparator.comparingInt(CompileError::getLine));
        FileWriter fileWriterName = new FileWriter("./samples/nameCheckerErrors.txt");
        PrintWriter printWriterName = new PrintWriter(fileWriterName);
        compileErrors.addAll(nameChecker.nameErrors);
        for (CompileError compileError : nameChecker.nameErrors) {
            printWriterName.println(compileError.getErrorMessage());
        }
        fileWriterName.close();

        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(program);
        typeChecker.typeErrors.sort(Comparator.comparingInt(CompileError::getLine));
        FileWriter fileWriter = new FileWriter("./samples/typeCheckErrors.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        compileErrors.addAll(typeChecker.typeErrors);
        for (CompileError compileError : typeChecker.typeErrors) {
            printWriter.println(compileError.getErrorMessage());
        }
        fileWriter.close();

        compileErrors.sort(Comparator.comparingInt(CompileError::getLine));
        for (CompileError compileError : compileErrors) {
            printWriterName.println(compileError.getErrorMessage());
            System.out.println(compileError.getErrorMessage());
        }

        if(typeChecker.typeErrors.isEmpty() && nameChecker.nameErrors.isEmpty()) {
            CodeGenerator codeGenerator = new CodeGenerator(typeChecker);
            codeGenerator.visit(program);
            runJasminCode();
        }
    }

    private static void runJasminCode() {
        try {
            System.out.println("---------------------------Compilation Successful---------------------------");
            File dir = new File("./codeGenOutput");
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "sh", "-c", "java -jar jasmin.jar *.j && java Main"
            );
            processBuilder.directory(dir);
            Process process = processBuilder.start();
            printResults(process.getInputStream());
            printResults(process.getErrorStream());
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printResults(InputStream stream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("Generated:")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
