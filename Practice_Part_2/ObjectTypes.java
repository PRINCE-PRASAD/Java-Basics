class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("inside the show method");
    }
}


public class ObjectTypes {
    public static void main(String[] args) {
        
        new A();  // object creation without refference
        System.out.println("---------- object reation without refference----------");
        A obj = new A(); //  object reation without refference
        obj.show();
    }
}
