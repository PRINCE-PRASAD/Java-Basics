class A {
    public void age() {
        System.out.println("i am inside age");
    }

    class B {
        public void name() {
            System.err.println("i am inside class b inside name");
            }
        }

       static class C {
            public void address() {
                System.out.println("i am inside address a static class");
            }
        }
}
/**
 * InnerClass
 */
public class InnerClass {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.age();

        A.B obj2 = obj1.new B(); // By this way we can use inner class as methods.
        obj2.name();

        A.C obj3 = new A.C();  // in inner class if class is static
        obj3.address();
    }
}