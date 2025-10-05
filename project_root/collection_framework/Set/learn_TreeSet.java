package Set;
import java.util.*;


public class learn_TreeSet {
    public static void main(String[] args) {
        // creating a TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>(); // or Set<Integer> set = new TreeSet<Integer>(); both are valid

        // inserting ele
        set.add(3); // t.c = O(log n)
        set.add(1);
        set.add(2);
        System.out.println(set); // Output will be in sorted order: [1, 2, 3]

        // removing ele : set.remove(ele)
        set.remove(2); // t.c = O(log n)
        System.out.println(set);

        // checking if an ele exists
        boolean contains = set.contains(1); // t.c = O(log n)
        System.out.println("Set contains 1: " + contains);

        // getting the size of the set
        int size = set.size(); // t.c = O(1)
        System.out.println("Size of the set: " + size);

        // traversing a TreeSet
        for (Object ele : set) { // t.c = O(n)
            System.out.println("Element: " + ele);
        }
    }    
}
