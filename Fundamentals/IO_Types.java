import java.util.*;


public class IO_Types{
    public static void main(String [] args){
        System.out.println("This is a String !"); 


        // --------------------- Taking Input --------------------------
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();

        sc.nextLine(); // if we obmit or avoid it 
        // then the next lin char after taking input n will not be 
        // consumed 

        String str = sc.nextLine();

        System.out.println(n);
        System.out.println(str);



        // --------------------Taking Input an entire Arr --------------------
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            Integer tmp = sc.nextInt();
            arr.add(tmp);
        }

        for (Integer integer : arr) {
            System.out.println(integer);
        }




        // --------------------- Data Types ---------------------------
        int integerr = 20;
        double pii = 3.14; 
        String str2 = "Hey It's a String !";
        char ch = 'A';
        long bigint = (1<<63) - 1;


        //----------------------Type Casting ------------------------
        int val = (int) 3.14;
        String ss = Integer.toString(99); // int -> Stiring 
        int vall = Integer.parseInt("9484"); // String -> int
        int chval = (int) 'a'; // 97 
        char chh = (char) (chval + 1); // 'b'


        
    }   
}