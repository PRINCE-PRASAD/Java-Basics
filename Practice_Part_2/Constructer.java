// class Human extends Object   // orignal hidden data
class Human
{
    public String name;
    public int age;

    public Human()
    {   //super();      // orignal hidden data of constructor
                        // 1. Constructor dont have any return type.
        name = "Rina";  // 2. Constructor has same name of class that it belong from
        age = 56;       // 3. whenever you create the obj by default you get the constructor data 
    }                   // 4. By default we always have a blank constructor 
                        // 5 whenever we create the constructor there is a default super class "super()" i it.

    public Human(int a, String n){  // constructor with parameters
       name = n;
       age = a;

    }
}

public class Constructer {
    public static void main(String[] args) {
    Human obj = new Human();
    Human obj1 = new Human(90, "kushal");

    System.out.println(obj.name + " : " + obj.age);
    System.out.println(obj1.name + " : " + obj1.age);
    }
    
}
