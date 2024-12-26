package Gainer;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // 1. Using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.println("HashMap:");
        hashMap.put("vishal", 10000);


        // hashMap.remove("vaibhav");

        putAndPrint(hashMap);

        // 2. Using LinkedHashMap (preserves insertion order)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("\nLinkedHashMap:");
        putAndPrint(linkedHashMap);

        // 3. Using TreeMap (sorts keys in natural order)
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("\nTreeMap:");

        treeMap.put("a", null);
        putAndPrint(treeMap);


    }

    // Common method to put elements and print key-value pairs
    public static void putAndPrint(Map<String, Integer> map) {
        // Inserting elements into the map
        //  map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map using for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Printing key-value pairs
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
    
    
  //  private static Map<Integer,Integer>  x  =  Map.of(4,6,8);
    
