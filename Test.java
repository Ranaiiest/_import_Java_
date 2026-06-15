import java.util.*;

public class Test{
    public static void main(String [] args){
        System.out.println("Hello World !");

        StringBuilder sb = new StringBuilder("Bulk");
        sb.append(" is the best");
        System.out.println(sb);

        // to reverse a string
        sb.reverse();
        System.out.println(sb);

        // to delete a substring from a string
        sb.delete(0, 5); // deletes from index 0 to index 4
        System.out.println(sb);

        // to insert a substring at a specific index
        sb.insert(0, "Bulk"); // inserts "Bulk" at index 0
        System.out.println(sb);

        // to replace a substring with another substring
        sb.replace(0, 4, "Bulk"); // replaces the substring from index 0 to index 3 with "Bulk"
        System.out.println(sb);

        // to get a substring from a string
        String sub = sb.substring(0, 4); // gets the substring from index 0 to index 3
        System.out.println(sub);

        // to get the length of a string
        int len = sb.length();
        System.out.println(len);
    }   
}