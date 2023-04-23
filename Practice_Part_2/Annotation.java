@Deprecated // if some one want use this this class it will notify him this class is  depricated
class A{
    public void HumHaiTest() {
        System.out.println("I am inside A");
    }
}
class B extends A {
    @Override  // here is the anotation it will show the problem
    public void HumHaTest() {
        System.out.println("I am inside B");
    }
}


public class Annotation {

    public static void main(String[] args) {
        B obj = new B();
        obj.HumHaiTest();
    }

}
