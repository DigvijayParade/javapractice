package collection_framworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionDemos {

    public static void main(String[] args) {

//        List<String> arrayList = new ArrayList<>(List.of("Banana", "Apple", "Banana"));
//        System.out.println("ArrayList (Dynamic Array): " + arrayList);
//
//        List<String> linkedList = new LinkedList<>(List.of("Banana", "Apple", "Banana"));
//        System.out.println("LinkedList (Node Chain):   " + linkedList);
//
        List<String> setInput = List.of("Banana", "Apple", "Cherry", "Apple");
//
//        Set<String> hashSet = new HashSet<>(setInput);
//        System.out.println("\nHashSet (Unordered):            " + hashSet);
//
//        Set<String> linkedHashSet = new LinkedHashSet<>(setInput);
//        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
//
        Set<String> treeSet = new TreeSet<>(setInput);
        System.out.println("TreeSet (Automatically Sorted):  " + treeSet);
//
//        Map<Integer, String> hashMap = new HashMap<>();
//
//   
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//
//      
//        Map<Integer, String> treeMap = new TreeMap<>();
//
//        List.of(30, 10, 20).forEach(key -> {
//            String val = "Item " + key;
//            hashMap.put(key, val);
//            linkedHashMap.put(key, val);
//            treeMap.put(key, val);
//        });
//
//        System.out.println("\nHashMap (Unordered Keys):             " + hashMap);
//        System.out.println("LinkedHashMap (Insertion Order Keys): " + linkedHashMap);
//        System.out.println("TreeMap (Sorted Keys):                " + treeMap);
    }
}