import java.util.*;

public class Strings {
    public static void main(String [] args){
        String s = "Ami toh Sesh!";

        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }

        System.out.println(s.charAt(2));
        String[] splited = s.split(" ");
        
        for(String str : splited ){
            System.out.println(str);
        }

        for(int i=0;i<splited.length;i++){
            System.out.println(splited[i]);
        }

        System.out.println(String.join(",",splited));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Ami"));
        System.out.println(s.startsWith("Ami "));
        System.out.println(s.endsWith("!"));



        // 2. Build result in loop (O(n), not O(n^2))
        StringBuilder res = new StringBuilder();
        for (String word : splited) {
            res.append(word).append(" ");
        }
        System.out.println(res.toString().trim());


        // 1. reverse a string 
        String any = "Hello World!";
        StringBuilder rev = new StringBuilder(any).reverse();
        System.out.println(rev.toString());

        // 2. frequency arr 
        int[] freq = new int[26];
        for (char c : any.toCharArray()){
            if (Character.isLetter(c)) {
                freq[Character.toLowerCase(c) - 'a']++;
            }
        }

        // booleans to check if it is aplha, digit or special char
        for (char c : any.toCharArray()){
            if (Character.isLetter(c)) {
                System.out.println(c + " is a letter");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit");
            } else {
                System.out.println(c + " is a special character");  
            }
        }



        // StringBuilder is a mutable sequence of characters. It is used to create and manipulate strings that can be modified after they are created. StringBuilder is more efficient than String when it comes to concatenating strings, as it does not create a new string object every time a modification is made.

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