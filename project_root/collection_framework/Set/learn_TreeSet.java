package Set;
import java.util.*;


public class learn_TreeSet {
    public static void main(String[] args) {

        // Imp methods : 
        // ts.first(), ts.last(), ts.floor(ele), ts.ceiling(ele),
        // ts.headSet(ele), ts.tailSet(ele), ts.higher(ele), ts.lower(ele) 

        // floor(ele) -> it gives the highest ele in the set which is strictly less than or equal to the given ele
        // ceiling(ele) -> it gives the lowest ele in the set which is strictly greater than or equal to the given ele
        // higher(ele) -> it gives the lowest ele in the set which is strictly greater than the given ele
        // lower(ele) -> it gives the highest ele in the set which is strictly less than   
        // lower_bound(ele) = ceiling(ele) in TreeSet

        TreeSet<Integer> ts = new TreeSet<Integer>(); 
        ts.add(1);
        ts.add(5); 
        ts.add(10); 


        int ele = ts.floor(6); 
        System.out.println("Floor of 6: " + ele); // Output: 5



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
        for(Object ele1 : set) { // t.c = O(n)
            System.out.println("Element: " + ele1);
        }
    }    
}
