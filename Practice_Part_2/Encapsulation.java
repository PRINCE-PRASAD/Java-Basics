class Human {
    private int age = 80; // this instance variable is private we can not access data in other class but we can access it with the help of methods.
    private String name = "Hina"; // here values are alredy defined

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

class Human1 {
    private int age; // here values will betaken from the main class.
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
        // this.age = age; // here we use this for showing that this.age variable is instance variable 
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
        // this.name = name;  // this keyword use for show the current object.
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        Human1 obj1 = new Human1();

        obj1.setAge(56); // seting the value
        obj1.setName("Jivan");
        ;
        // System.out.println(obj.age + " : " + obj.name); //if method is not private we can call it using this method.
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
