package main.symbolTable;

import main.ast.type.Type;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    private LinkedList<Type> returnTypes = new LinkedList<>();
    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }
    public static void pop() {
        top = stack.pop();
    }
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
        items.put(item.getKey(), item);
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if( symbolTableItem != null ){
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
    public Map<String, SymbolTableItem> getItems() { return  this.items; }
    public void setReturnTypes(Type newReturnType) { this.returnTypes.add(newReturnType); }
    public LinkedList<Type> getReturnTypes() { return this.returnTypes; }
    public void clearReturnTypes() { this.returnTypes = new LinkedList<>(); }
}
