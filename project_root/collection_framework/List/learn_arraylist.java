// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

import java.util.*;// wildcard import


public class learn_arraylist{
    public static void main(String[] args){
        // creating an arraylist
        ArrayList<String> prog_lang = new ArrayList<String>();

        // inserting ele
        prog_lang.add("java");
        prog_lang.add("cpp");
        prog_lang.add("python");

        Collections.swap(prog_lang, 0, 2); // to swap two ele t.c = O(1)

        List<Integer> popularity = new ArrayList<Integer>();

        popularity.add(9);
        popularity.add(7);
        popularity.add(10);

        // create a arraylist with specified size to use it as frequency array
        ArrayList<Integer> freq = new ArrayList<Integer>(Collections.nCopies(100, 0));
        // Collections.nCopies(size, initial_value) -> it will create a list of given size with all ele as initial_value
        // t.c = O(n)
        freq.set(9, freq.get(9) + 1); // incrementing the frequency of 9

        // arr.add(index, val) -> to add at a particular index  t.c = O(n)
        // arr.addAll(another_arr) -> it will append the another_arr to the end of arr t.c = O(n)
        ArrayList<Integer> more_popularity = new ArrayList<Integer>();
        more_popularity.add(8);
        popularity.addAll(more_popularity);
        System.out.println(prog_lang);

        // accessing ele
        String first_lang = prog_lang.get(0);
        System.out.println("First prog lang: " + first_lang);
        // arr.set(index, val) -> to update the value at a particular index t.c = O(1)
        prog_lang.set(0, "javascript");
        

        // removing ele
        prog_lang.remove(2); // remove by index t.c = O(n)
        prog_lang.remove(String.valueOf("cpp")); // remove by value t.c = O(n)
        popularity.remove(Integer.valueOf(10)); // remove by value t.c = O(n)
        // arr.clear() -> to remove all ele t.c = O(n)

        System.out.println(prog_lang.contains("C#")); // to check if an ele is present or not t.c = O(n)
        System.out.println(prog_lang.size()); // to get the size of the arraylist t.c = O(1)
        System.out.println(prog_lang.isEmpty()); // to check if the arraylist is empty or not t.c = O(1)


        // Traversing an arraylist
        // 1. for loop
        for(int i=0; i<prog_lang.size(); i++){
            System.out.print(prog_lang.get(i) + " ");
        }
        System.out.println();
        // 2. for-each loop
        for(String lang : prog_lang){
            System.out.print(lang + " ");
        }
        System.out.println();
        // 3. using iterator
        Iterator<String> it = prog_lang.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }
}