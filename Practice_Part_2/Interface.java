/**
 * Innerpart01_output
 */
interface A {

    int age = 56; // all veriable in the interface are final and static by default and we can't
                  // change the value.
    String Location = "kolkata";

    void name();

    void grade();
}

interface C {
    void run();
}

class B implements A, C {
    public void name() {
        System.out.println("i am prasad");
    }

    public void grade() {
        System.out.println("A++");
    }

    public void run() {
        System.out.println("Running and example of multiple inheritence");
    }

}

public class Interface {
    public static void main(String[] args) {
        A obj; // we can't create obj of A because of interfase
        obj = new B();
        obj.name();
        obj.grade();

        C obj1; // for new interface we have to create new obj
        obj1 = new B();
        obj1.run();

        System.out.println(obj.Location);
    }
}
/*
 * class -> class = extends
 * interface -> class = implements
 * interface -> interface = extends
 */