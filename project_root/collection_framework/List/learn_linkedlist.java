import java.util.*;

// It is slower than arraylist because it uses doubly linked list to store the ele
// it is better to use arraylist. 

public class learn_linkedlist {
    public static void main(String[] args) {
        // creating a linkedlist
        LinkedList<String> prog_lang = new LinkedList<String>();

        // inserting ele t.c = O(1)
        prog_lang.add("java");
        prog_lang.add("cpp");
        prog_lang.add("python");

        List<Integer> popularity = new LinkedList<Integer>();

        popularity.add(9);
        popularity.add(7);
        popularity.add(10);

        // arr.add(index, val) -> to add at a particular index  t.c = O(n)
        // arr.addAll(another_arr) -> it will append the another_arr to the end of arr t.c = O(n)
        LinkedList<Integer> more_popularity = new LinkedList<Integer>();
        more_popularity.add(8);
        popularity.addAll(more_popularity);
        System.out.println(prog_lang);

        // accessing ele t.c = O(n)
        String first_lang = prog_lang.get(0);
        // arr.set(index, val) -> to update the value at a particular index t.c = O(n)
        prog_lang.set(0, "javascript");

        // removing ele t.c = O(n)
        prog_lang.remove(2); // remove by index
        prog_lang.remove(String.valueOf("cpp")); // remove by value
        popularity.remove(Integer.valueOf(10)); // remove by value
        // arr.clear() -> to remove all ele t.c = O(n)

        // Traversing a linkedlist
        // 1. for loop t.c = O(n)
        for (int i = 0; i < prog_lang.size(); i++) {
            System.out.print(prog_lang.get(i) + " ");
        }
    }
}
