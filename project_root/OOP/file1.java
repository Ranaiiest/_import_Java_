package project_root.OOP;
import java.util.Arrays;



//-------------------------------------------------Object & class----------------------------------------------------
// class -> it is a custom data type consist of collection of methods and attributes to construct custom objects.
// object -> it is an instance of the class 
// class variables are also called instance variables 
// private class pvt{
//     public pvt(){

//     }
//     void f(){
//         System.out.println("f");
//     }
// }

public class file1 {
    public void hi(){
        System.out.println("Hi");
    }

    public static class Student{ // this is a nested or inner member class of file1

        //---------------------------------------------- member variables -------------------------------------------------------------------
        double marks;
        String name;
        int rno;
        //----------------------------------------------- Methods (static vs non-static) ---------------------------------------------------------
        public static void static_method(){
            System.out.println("this is a static method !");
        }
        public void non_static_method(){
            System.out.println("this is a non-static method !");
        }

        //-----------------------------------------------Constructor--------------------------------------------------------
        // eligible access modifier for constructor are = public, private and protected
        public Student(){ // default constructor
            marks = 0;
            name = "";
            rno = 0;
        }

        public Student(int rno,double marks, String name) { // parameterized constructor
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        public Student(Student another_student ){
            this.marks = another_student.marks;
            this.name = another_student.name;
            this.rno = another_student.rno;
        }
    }


    //----------------------------------------------Java access modifiers------------------------------------------

    // There are major 4 access modifiers in java :-
    // private
    // public
    // protected
    // default

    // for top level class only default and public is allowed
    // for inner class ( which is present as a member in another class ) 

    // non access modifiers for class : final (const in cpp), abstract (can only be implemented via subclasses )
    // non access modifiers for members : final, abstract (only for methods who does not have body overriden via subclass), static


    //-----------------------------------------------Main-----------------------------------------------------------
    public static void main(String[] args) {
        // create a details of 5 students
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students)); // [null,null,null,null,null]
        students[0] = new Student();
        students[0].marks = 23.30;
        students[0].rno = 31;
        students[0].name = "Ilya"; 

        // ❌ it will give error : private access modifier is not allowed 
        // pvt obj = new pvt(); 
        // obj.f();

        // Student.static_method(); // we can access static method without creating instance 
        // // Student.non_static_method(); // we can't access non-static method without creating instance
        // students[0].static_method();

        // System.out.println(students[0]); // OOP.file1$Student@62bd765
    }
}
