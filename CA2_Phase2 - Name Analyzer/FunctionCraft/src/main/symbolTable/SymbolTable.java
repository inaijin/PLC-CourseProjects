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
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    public Map<String, SymbolTableItem> getItems() { return this.items; }
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
    public SymbolTable(SymbolTable other) {
        this.items = new HashMap<>(other.items); // Shallow copy of the map
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
    public void printFull() {
        System.out.println("Current Symbol Table:");
        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
            System.out.println("  Key: " + entry.getKey() + ", Item: " + entry.getValue());
        }
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
