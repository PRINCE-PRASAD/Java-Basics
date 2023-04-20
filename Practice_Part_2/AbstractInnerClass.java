import javax.swing.AbstractAction;

abstract class A
{
    public abstract void show();
    public abstract void name();
}

/**
 * AbstractInnerClass
 */
public class AbstractInnerClass {

    public static void main(String[] args) {
        A obj = new A() {
            
            public void show(){
                System.out.println("in new show"); // here we can declear the abstract class in new concreate class 
            }

            public void name() {
                System.out.println("i am prasad");
            }
        };
        obj.show();
        obj.name();
    }
}