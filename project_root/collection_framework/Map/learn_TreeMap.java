package Map;
import java.util.*;

public class learn_TreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("One", 1); // t.c = O(log n)
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing a value
        int value = treeMap.get("Two"); // t.c = O(log n)
        System.out.println("Value for key 'Two': " + value);

        // Removing a key-value pair
        treeMap.remove("Three"); // t.c = O(log n)
        System.out.println("After removing key 'Three': " + treeMap);

        // Checking if a key exists
        boolean isExists = treeMap.containsKey("Hello"); // t.c = O(log n)
        System.out.println("TreeMap contains key 'Hello': " + isExists);

        // traversing the TreeMap
        for(Object key : treeMap.keySet() ){ // t.c = O(nlogn)
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key)); // t.c = O(log n)
        }
    }
}
