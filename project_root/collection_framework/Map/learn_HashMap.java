package Map;
import java.util.*;

public class learn_HashMap {
    
    public static void main(String[] args) {
        // creating a HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // inserting ele
        map.put(1, "One"); // t.c = O(1) on average
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);

        // accessing ele
        String value = map.get(2); // t.c = O(1) on average
        System.out.println("Value at key 2: " + value);

        // removing ele : map.remove(key)
        map.remove(3); // t.c = O(1) on average and in worst case O(n)  
        System.out.println(map);

        // checking if a key exists
        boolean hasKey = map.containsKey(1); // t.c = O(1) on average and in worst case O(n)
        System.out.println("Map contains key 1: " + hasKey);

        // checking if a value exists
        boolean hasValue = map.containsValue("Two"); // t.c = O(n)
        System.out.println("Map contains value 'Two': " + hasValue);

        // getting the size of the map
        int size = map.size(); // t.c = O(1)
        System.out.println("Size of the map: " + size);

        // traversing a HashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) { // t.c = O(n)
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        for (Object key : map.keySet()) { // t.c = O(n)
            System.out.println("Key: " + key + ", Value: " + map.get(key)); // t.c = O(1) on average
        }
    }
}
