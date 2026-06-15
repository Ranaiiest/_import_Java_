package project_root.OOP;
import java.util.Arrays;

// Resources used : 
// 1. https://www.geeksforgeeks.org/java-oops-concepts/
// 2. https://www.tpointtech.com/java-tutorial
// 3. https://www.w3schools.com/java/java_oop.asp

// ----------------------------------------- Rules in Java classes ------------------------------------------------------
// 1. A Java source file can contain only one top-level public class, and that public class must have the same name as the file.




//-------------------------------------------------Object & class----------------------------------------------------
// class -> a class is a custom data type that groups methods and attributes used to create objects.
// object -> an object is an instance of a class.
// class variables are static variables, while instance variables belong to specific objects.

// In Java, a top-level class cannot be declared private, but a nested class member can be private.
// A private nested class is accessible only within its enclosing class and not from outside it.
// private class pvt{
//     public pvt(){

//     }
//     void f(){
//         System.out.println("f");
//     }
// }

class global_var {
    public static int var;
}

public class file1 {
    public void hi(){
        global_var.var = 10;// using global var
        System.out.println("Hi");
    }

    public static class Student{ // this is a static nested class of file1

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
        // eligible access modifiers for constructors are public, private, protected, and package-private (default).
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

        public Student(Student another_student ){ // copy constructor
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

    // Top-level classes can be public or package-private (default access).
    // Inner classes are nested class members inside another class.

    // non-access modifiers for classes: final (prevents subclassing), abstract (cannot be instantiated and is extended by subclasses)
    // non-access modifiers for members: final, abstract (abstract methods have no body and must be overridden by subclasses), static

    // final prevents a class from being subclassed; private is an access modifier, not a substitute for final.


    //------------------------------------------------- Inheritance ----------------------------------------------------
    // guide : https://www.geeksforgeeks.org/inheritance-in-java/
    // Java visibility rules for inheritance
    // 1. private members are inherited but are not accessible in subclasses.
    // 2. An overriding method in a subclass cannot use more restrictive access than the overridden method.
    // 3. A top-level class can be inherited if it is public or package-private and the subclass is in the same package.
    // 4. To extend a superclass from a different package, the superclass must be public and its accessible members should be public or protected.

    // types of inheritance in java : 
    // 1. single inheritance
    // code 
    class Parent{
        void show(){
            System.out.println("Parent class");
        }
    }
    class Child extends Parent{
        void display(){
            System.out.println("Child class");
        }
    }
    // 2. multilevel inheritance
    class GrandChild extends Child{
        void print(){
            System.out.println("GrandChild class");
        }
    }
    
    // 3. hierarchical inheritance
    class AnotherChild extends Parent{
        void fun(){
            System.out.println("Another Child class");
        }
    }
    // 4. multiple inheritance is not allowed in java via classes but it is allowed via interfaces
    // 5. hybrid inheritance is not allowed in java via classes but it is allowed via interfaces

    // super keyword : it is used to refer immediate parent class object
    // 1. to access parent class instance variable
    // 2. to access parent class method
    // 3. to access parent class constructor

    // code 
    class A{
        int x;
        public A(int x){ // if we do not write constructor in parent class then compiler will add default constructor which will call super() but 
            // if child class constructor does not call parent class constructor explicitly then compiler will add super() in child class constructor
            this.x = x;
        }

        void show(){
            System.out.println("A class");
        }
    }
    class j extends A{
        int y;

        // if we do not write constructor in child class then compiler will add default constructor which will call super() but 
        // if parent class does not have default constructor then it will give compile time error
        public j(int x, int y) {
            super(x);
            this.y = y;
        }

        // private void show(){} // it will give error : as we try to reduce visibility of inherited method
        void val_of_x(){
            System.out.println("value of x is : "+super.x); // accessing parent class instance variable
        }

        void display(){
            super.show(); // calling parent class method
            System.out.println("B class");
        }
    }


    //--------------------------------------------------------------------- Inner class --------------------------------------------------------------
    // Inner classes are nested classes defined within another class.
    // 1. non-static inner class (instance inner class)

//------------------- Top-level Outer class -------------------
class Outer{
    int x = 10;
    class Inner{
        void f(){
            System.out.println("inner class");
        }
        void show(){
            System.out.println("value of x is : "+x);
        }
    }
    void g(){
        Inner obj = new Inner();
        obj.f();
    }
    // 2. static inner class ( static nested class)
    public static class Static_Inner{
        void f(){
            System.out.println("static inner class");
        }
    }
}

class Test{
    void g(){
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner(); // syntax to create object of non-static inner class
        in.f();
        in.show();
        Outer.Static_Inner si = new Outer.Static_Inner(); // syntax to create object of static inner class
        si.f();
    }
}


    //---------------------------------------------------------- Java Interface ----------------------------------------------------------
    // defn : interface is a abstract type which is used to specify a behavior(abstract method) that classes must implement
    // imp points :
    // 1. interface can have abstract methods ( only method signature no body) and default methods ( method with body)
    // 2. it cannot be instantiated (we cannot create an object of an interface)
    // 3. a class can implement multiple interfaces ( multiple inheritance is allowed via interfaces)
    // 4. interface can extend multiple interfaces ( hybrid inheritance )
    // 5. interface and abstract class are similar but interface is more abstract than abstract class both are used to achieve abstraction
    // 6. Abstract interface methods are public by default; interfaces may also declare default, static, and private methods with bodies.
    // 7. All variables in an interface are public, static, and final by default (constants).
    // 8. to implement an interface we use implements keyword
    // 9. a class can implement multiple interfaces but can extend only one class ( abstract or normal)
    // 10. if a class implements an interface then it must override all the abstract methods of the interface or else it will give compile time error
    // 11. if a class implements an interface and does not override all the abstract methods of the interface then that class must be declared as abstract
    // 12. interface can have static methods with body ( from java 8)
    // 13. interface can have private methods with body ( from java 9)

    // code 
    interface Animal{
        // int x; // it will give error : interface variable must be initialized as they are final by default
        int x = 10; // public static final by default
        void sound(); // public abstract by default
        default void eat(){ // default method
            System.out.println("Animal is eating");
        }
        static void sleep(){ // public static method
            System.out.println("Animal is sleeping");
        }
        private void fun(){ // private method
            System.out.println("private method in interface");
        }
        // void m(); // public abstract by default
        // {
        //     // body
        // } // this is invalid because an ordinary interface method cannot have a body unless it is default, static, or private
    }
    class Dog implements Animal{
        public void sound(){ // must override abstract method
            System.out.println("Dog barks");
        }
        // public void eat(){ // can override default method
        //     System.out.println("Dog is eating");
        // }
    }

    // the difference between abstract class and interface
    // 1. abstract classes can have instance variables but interfaces cannot have instance variables other than constants
    // 2. abstract classes can have constructors but interfaces cannot have constructors
    // 3. abstract classes can have concrete methods, while interfaces can have default, static, and private methods with bodies.
    // 4. a class can extend only one abstract class but can implement multiple interfaces.
    
    // example
    abstract class A1{
        int x; // instance variable
        abstract void fun(); // abstract method
        void show(){ // concrete method
            System.out.println("A1 class");
        }
    }
    class B1 extends A1 implements Animal{
        public void fun(){
            System.out.println("fun method");
        }
        public void sound(){
            System.out.println("B1 class");
        }
    }

    //---------------------------------------------------------- Abstract class ----------------------------------------------------------
    // defn : abstract class is a class which is declared with abstract keyword and it can have abstract methods 
// (only method signature, no body) and concrete methods (method with body); like an interface, it cannot be instantiated
// (we cannot create an object of an abstract class)

    // imp points :
    // 1. it can have abstract methods (only method signature, no body) and concrete methods (method with body)
    // 2. it cannot be instantiated (we cannot create an object of an abstract class)
    // 3. a class can extend only one abstract class (no multiple inheritance via classes)
    // 4. abstract classes can extend another abstract class or a normal class
    // 5. if a class extends an abstract class then it must override all the abstract methods of the abstract class or else it will give compile time error
    // 6. if a class extends an abstract class and does not override all the abstract methods of the abstract class then that class must be declared as abstract
    // 7. abstract class can have instance variables
    // 8. abstract class can have constructor

    abstract class Shape{
        int x,y; // instance variables
        public Shape(int x, int y){ // constructor
            this.x = x;
            this.y = y;
        }
        abstract void draw(); // abstract method
        void show(){ // concrete method
            System.out.println("Shape class");
        }
    }
    class Circle extends Shape{
        int r;
        public Circle(int x, int y, int r){
            super(x,y);
            this.r = r;
        }
        void draw(){ // must override abstract method
            System.out.println("Circle class");
        }
    }
    class Rectangle extends Shape{
        int l,b;
        public Rectangle(int x, int y, int l, int b){   
            super(x,y);
            this.l = l;
            this.b = b;
        }
        void draw(){ // must override abstract method
            System.out.println("Rectangle class");
        }
    }

    //---------------------------------------------------------- Instance variables vs Class variables ----------------------------------------------------------
    // instance variables are non-static variables and class variables are static variables.
    // every object has its own copy of instance variables, while all objects share the same copy of class variables.
    // both instance and static variables are part of the class data area; static variables are associated with the class rather than individual objects.
    // instance variables are initialized when an object is created, while class variables are initialized when the class is loaded.

    //------------------------------------------------------------   Polymorphism    ----------------------------------------------------------
    // defn : polymorphism is the ability of methods to take many forms.
    // types of polymorphism in java :
    // 1. compile time polymorphism ( static polymorphism or method overloading)
    class Math{
        int add(int a, int b){
            return a+b;
        }
        int add(int a, int b, int c){
            return a+b+c;
        }
        double add(double a, double b){
            return a+b;
        }
    }
    // 2. runtime polymorphism ( dynamic polymorphism or method overriding)
    class Animal1{
        void sound(){
            System.out.println("Animal makes a sound");
        }
    }
    class Dog1 extends Animal1{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    class Cat1 extends Animal1{
        void sound(){
            System.out.println("Cat meows");
        }
    }

    //----------------------------------------------------------- Abstraction ----------------------------------------------------------
    // defn : abstraction is the process of hiding the implementation details and showing only the functionality to the user
    // abstraction can be achieved via abstract class and interface
    // example is already discussed in abstract class and interface section

    //----------------------------------------------------------- Encapsulation ----------------------------------------------------------
    // defn : encapsulation is the process of wrapping data ( variables) and methods ( functions ) together as a single unit called class
    // in encapsulation the variables of a class will be hidden from other class by declaring it with private access modifier and can be accessed 
    // only via methods of their current class this is also known as data hiding.
    // to achieve encapsulation in java we use getter and setter methods

    class Person{
        private String name; // private variable
        private int age; // private variable

        // getter method for name
        public String getName(){
            return name;
        }
        // setter method for name
        public void setName(String name){
            this.name = name;
        }
        // getter method for age
        public int getAge(){
            return age;
        }
        // setter method for age
        public void setAge(int age){
            if(age<0){
                System.out.println("Age cannot be negative");
            }else{
                this.age = age;
            }
        }
    }

    

    //-----------------------------------------------------------Main--------------------------------------------------------------------
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
