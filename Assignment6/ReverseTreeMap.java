package Assignment6;

import java.util.*;

public class ReverseTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to treeMap
        treeMap.put(1, "Jack");
        treeMap.put(2, "Rick");
        treeMap.put(3, "Kate");
        treeMap.put(4, "Tom");
        treeMap.put(5, "Steve");

        System.out.println("Reversed: " + treeMap.descendingMap());

    }

}
