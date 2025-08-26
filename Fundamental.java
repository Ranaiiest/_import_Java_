import java.util.Scanner;


public class Fundamental {

    public static void main(String[] args){

        //--------------------------------------Taking input from command----------------------------------------------------------
        Scanner scanner = new Scanner(System.in);// create Scanner obj
        System.err.println("enter your name : ");
        String name2 = scanner.nextLine();
        System.err.println("the name2 is = "+name2);

        System.err.println("enter your age : ");
        int age2 = scanner.nextInt();
        System.err.println("the age2 is = "+age2);
        /*
         * nextLine() -> reads a String value from the user
         * nextInt() -> reads int value from the user
         * nextBoolean() -> reads boolean val from user
         * nextFloat() -> to read float
         * nextLong() -> to read long
         * nextShort() -> to read short
         */

        //------------------------------------------------------ Variable and Data types--------------------------------------
        int age = 19;
        double salary = 45000.0;
        String name = "Priyabrata";
        boolean isStudent = true;
        System.out.println("my age is " + age + " !");

        // ----------------------------------------------------------Conditional statement-----------------------------------------
        if( age >= 18 ) System.out.println("eligible for vote ");
        else System.out.println("not eligible !");

        // ----------------------------------------------------------Loop statement------------------------------------------------
        for(int i=1;i<=5;i++){
            System.out.println("I have " + i + " gfs !");
        }

        int cnt = 10;
        while( cnt > 0 ) {
            System.err.println("this is while loop ");
            cnt--;
        }
        cnt = 10;
        do {
            System.err.println("This is do while loop");
            cnt--;
        }while( cnt > 0 );


    }
}