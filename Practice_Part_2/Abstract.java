/*
abstract class Car {
    public abstract void drive();   // abstract method always defined in abstract class but Abstract class can exist without method.

    public void Playmusic() {
        System.out.println("Playing music");
    }
}

class Swift extends Car {
    public void drive()   // if u extend the abtract class then have to redefine the abstract method of it.
    {
        System.out.println("Driving.......");
    }
}
public class Abstract {

    public static void main(String[] args) {
        Car obj = new Swift(); // u can not create the direct object of abstract class.
        obj.Playmusic();
        obj.drive();
    }
}
*/

// -------------------------------------------------------------------------------------------------------

abstract class Car {
    public abstract void drive();  
    public abstract void fly();
    public void Playmusic() {
        System.out.println("Playing music");
    }
}

abstract class Swift extends Car {
    public void drive()  
    {
        System.out.println("Driving.......");
    }
}

class Swift_v2 extends Swift{     //concrete class
    public void fly() {
        System.out.println("flying.............");
    }
}
public class Abstract {

    public static void main(String[] args) {
        Car obj = new Swift_v2(); 
        obj.Playmusic();
        obj.drive();
        obj.fly();
    }
}