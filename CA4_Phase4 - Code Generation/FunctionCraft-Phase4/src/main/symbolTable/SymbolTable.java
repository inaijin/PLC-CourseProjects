package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.symbolTable.utils.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private static final Stack<SymbolTable> stack = new Stack<>();
    public static SymbolTable top;
    public static SymbolTable root;
    private final Map<String, SymbolTableItem> items;
    private String functionReturnType;

    public SymbolTable() {
        this.items = new HashMap<>();
    }

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public Map<String, SymbolTableItem> getItems() {
        return items;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if (symbolTableItem != null) {
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }

    public SymbolTable copy() {
        SymbolTable newSymbolTable = new SymbolTable();
        newSymbolTable.items.putAll(this.items);
        return newSymbolTable;
    }

    public void printFull() {
        System.out.println("Current Symbol Table:");
        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
            System.out.println("  Key: " + entry.getKey() + ", Item: " + entry.getValue());
        }
    }

    public String getFunctionReturnType() {
        return functionReturnType;
    }

    public void setFunctionReturnType(String returnType) {
        this.functionReturnType = returnType;
    }

    public ArrayList<Integer> rangeFuncArglen() {
        int upperBound = 0;
        int lowerBound = 0;
        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
            if(entry.getValue() instanceof VarItem varItem) {
                if(!varItem.isArg())
                    continue;
            }
            upperBound += 1;
            if (entry.getValue() instanceof VarItem varItm) {
                if(!varItm.isDefaultVal())
                    lowerBound += 1;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(upperBound); arrayList.add(lowerBound);
        return arrayList;
    }
}
