package project_root.OOP;
import java.util.Arrays;

// Resources used : 
// 1. https://www.geeksforgeeks.org/java-oops-concepts/
// 2. https://www.tpointtech.com/java-tutorial
// 4. https://www.w3schools.com/java/java_oop.asp

// -----------------------------------------Rules in Java class ------------------------------------------------------
// 1. there is only one public class allowed in java and that class will have same name as the file




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

class global_var {
    public static int var;
}

public class file1 {
    public void hi(){
        global_var.var = 10;// using global var
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

    // we can use final to not allow inheritance for a class or declare the class access modifiers as private 


    //------------------------------------------------- Inheritance ----------------------------------------------------
    // guide : https://www.geeksforgeeks.org/inheritance-in-java/
    // java visibility rule for inheritance
    // 1. private members are not inherited
    // 2. while inheriting members from parent then visibility can not be decreased if decreased then it will give compile time error
    // 3. to allow inheritance for a class the class should be either public or default ( if both parent and child class are in same package)
    // 4. to access super class member from a class in different package the super class member should be public or protected and the super class should be public

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
        public A(int x){
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


    //---------------------------------------------------------------------Inner-class--------------------------------------------------------------
    // inner class is a class which is a mem
    // 1. non-static inner class ( instance inner class)

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
    // 2. it can not be instantiated ( we can not create object of interface)
    // 3. a class can implement multiple interfaces ( multiple inheritance is allowed via interfaces)
    // 4. interface can extend multiple interfaces ( hybrid inheritance )
    // 5. interface and abstract class are similar but interface is more abstract than abstract class both are used to achieve abstraction
    // 6. all methods in interface are by default abstract and public
    // 7. all variables in interface are by default public, static and final ( constants)
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
        // } // it will give error : interface method can not have body
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
    // 1. abstract class can have instance variables but interface can not have instance variables
    // 2. abstract class can have constructor but interface can not have constructor
    // 3. abstract class can have concrete methods but interface can not have concrete methods ( only default and static methods)
    // 4. a class can extend only one abstract class but an interface can implement multiple interfaces
    
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
    // ( only method signature no body) and concrete methods ( method with body) and like interface it can not be instantiated 
    // ( we can not create object of abstract class)

    // imp points :
    // 1. it can have abstract methods ( only method signature no body) and concrete methods ( method with body)
    // 2. it can not be instantiated ( we can not create object of abstract class)
    // 3. a class can extend only one abstract class ( no multiple inheritance via classes)
    // 4. abstract class can extend another abstract class or normal class
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

    //---------------------------------------------------------- Instace variables vs Class variables ----------------------------------------------------------
    // instance variables are non-static variables and class variables are static variables
    // every object has its own copy of instance variables but all objects share the same copy of class variables
    // instance variables stored in heap memory but class variables stored in stack memory
    // instance variables are initialized when object is created but class variables are initialized when class is loaded

    //------------------------------------------------------------   Polymorphism    ----------------------------------------------------------
    // defn : polymorphism is the ability of an methods (can not applied to class or instance varialbles ) to take on many forms
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
                System.out.println("Age can not be negative");
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
