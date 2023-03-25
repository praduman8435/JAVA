import java.util.*;

public class oops {
    public static void main(String[] args) {
        //objects-->entities in the real world
        //classes-->groups of these entities

         /*

        getters and setters:--

        get-->to return the value
        set-->to modify the value
        this:-->"this" keyword is used to refer to the current object

        */

//        Pen p1 = new Pen();
//        p1.setColor("blue");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());
//        p1.setColor("yellow");
//        System.out.println(p1.getColor());
//
//
//        BankAccount myAcc = new BankAccount();
//        myAcc.username = "shraddha Khapra";
//        myAcc.setPassword("abcdefghi");
//
//        //encapsulation-->wrapping up of data & methods under a single unit. it also implements data hiding
//
////        Student s1= new Student("praduman");
////        System.out.println(s1.name);
//
//        //copy constructor
//        Student s1=new Student();
//        s1.name="ram";
//        s1.roll=434;
//        s1.password="abcd";
//        s1.marks[0] = 100;
//        s1.marks[1] = 134;
//        s1.marks[2] = 144;
//
//        Student s2= new Student(s1);
//        s2.password= "xyz";
//
//        for (int i=0;i<3;i++){
//            System.out.println(s2.marks[i]);
//        }
//
////        Fish shark = new Fish();
////        shark.eat();
//
//        calculator calc =new calculator();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum((float) 1.3,(float)2.5));
//        System.out.println(calc.sum(1,3,5));
//
//        deer d =new deer();
//        d.eat();
//
//        //user defined package
//        Scanner sc =new Scanner(System.in);
//        int a= sc.nextInt();
//        System.out.println(a);
//
//        /*abstraction-->hiding all the unnecessary details and showing only the important to the user.
//        1. Abstract class -->  -cannot create an instance of abstract class
//                               -can have abstract/non-abstract methods
//                               -can have constructor
//        2. interfaces
//         */
//
//        Horse h= new Horse();
//        h.eat();
//        h.walk();
//        h.changeColor();
//
//        chicken c= new chicken();
//        c.walk();
//        c.eat();


        Queen q=new Queen();
        q.moves();

        Student s1=new Student();
        s1.schoolname="DPS";

        Student s2=new Student();
        System.out.println(s2.schoolname);

        Student s3=new Student();
        s1.schoolname="ABC";
    }
}

/*
inheritance-->inheritance is when properties and methods of base class are passed on to a derived class
 */



class Pen {
   String color;
   int tip;

    void setColor(String newColor) {
        this.color =newColor;
    }
    void setTip(int newTip){
        this.tip =newTip;
    }

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}


class BankAccount{
   public String username;
   private String password;
   public void setPassword(String pwd){
       password=pwd;
   }
}

/*

 Constructors-->constructor is a special method which is invoked automatically at the time of object creation.
        -constructor have the same name as class or structure.
        -constructor don't have a turn type.(not even void)
        -constructor are only called once, at object creation
        -memory allocation happens when constructor is called

        types of constructor-->
        1.non-parameterized
        2.parameterized
        3.copy constructor

*/

//class Student{
//    String name;
//    int age;
//    float percentage;
//    int roll;
//    String password;
//    int marks[];

    //shallow copy constructor
//    Student(Student s1){
//        marks =new int[3];
//        this.name= s1.name;
//        this.roll= s1.roll;
//        this.marks= s1.marks;
//    }
//    void calcPercentage(int phy, int chem, int math){
//        percentage= (phy+chem+math)/3;
//    }
//
//    //deep copy constructor
//    Student(Student s1){
//        marks =new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        for(int i=0;i< marks.length;i++){
//            this.marks[i] =s1.marks[i];
//        }
//    }
//    Student(){
//        marks =new int[3];
//        System.out.println("constructor is called...");
//    }
//    Student(String name){
//        marks =new int[3];
//        this.name =name;
//    }
//    Student(int roll){
//        marks =new int[3];
//        this.roll =roll;
//    }
//}

//inheritance--

//base class
//class Animal{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//    void breathe(){
//        System.out.println("breathes");
//    }
//}

//derived class
//class Fish extends Animal{
//    int fins;
//
//    void swim(){
//        System.out.println("swims in water");
//    }
//}

//method overloading
class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//method overriding-->parent and child classes both contain the same function with a different definition
        class Animal {
            void eat() {
                System.out.println("eats anything");
            }
        }
        class deer extends Animal {
            void eat() {
                System.out.println("eats grass");
            }
        }


abstract class animal{
    String color;
    animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
        }
        class Horse extends animal{
    void changeColor(){
        color="darkBrown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
        }
        class chicken extends animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
        }


//interfaces-->it is a blueprint of class
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonally(in all direction");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal(by one step");
    }
}


//static keywords-->static keywords in java is used to share the same variable or method of a given class
class Student{
    String name;
    int roll;

    static String schoolname;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}

