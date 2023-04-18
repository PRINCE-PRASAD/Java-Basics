class A {
    public void show() {
        System.out.println("i am inside A");
    }
}

class B extends A {
    public void show() {
        System.out.println("i am inside B");
    }
}

class C extends A{
    public void show() {
        System.out.println("i am inside C");
    }
}

/**
 * DynamicMethodDispatching
 */
public class DynamicMethodDispatching {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}

// Fsor same object call we get different behaviour ( Runtime Polymorphism)
// All this method is called dynamic method dispatch
// Dynamic Method Dispatch inheritance + polymorphism