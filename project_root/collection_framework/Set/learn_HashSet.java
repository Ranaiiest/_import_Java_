package Set;
import java.util.*;


public class learn_HashSet {
    public static void main(String[] args) {
        // creating a HashSet
        HashSet<Integer> set = new HashSet<Integer>(); // or Set<Integer> set = new HashSet<Integer>(); both are valid

        // inserting ele
        set.add(1); // t.c = O(1) on average
        set.add(2);
        set.add(3);
        System.out.println(set);

        // removing ele : set.remove(ele)
        set.remove(2); // t.c = O(1) on average and in worst case O(n)  
        System.out.println(set);

        // checking if an ele exists
        boolean contains = set.contains(1); // t.c = O(1) on average and in worst case O(n)
        System.out.println("Set contains 1: " + contains);

        // getting the size of the set
        int size = set.size(); // t.c = O(1)
        System.out.println("Size of the set: " + size);

        // traversing a HashSet
        for (Object ele : set) { // t.c = O(n)
            System.out.println("Element: " + ele);
        }
    }
}
