class A
{
    public void show() {
        System.out.println(" i am under class A main");
    }
}


public class Anonymous_InnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show() {
                System.out.println("i am under class demo overiding the show class");
            }

        };
        obj.show();
    }
}

