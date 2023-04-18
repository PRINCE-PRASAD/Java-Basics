class computer{
public void show() {
    System.out.println("i am value of computer class");
}
}

class Laptop extends computer{
    public void show2() {
        System.out.println("i am value of Laptop class");
    }
    }

public class UpcastingDowncasting {
    public static void main(String[] args) {
         // computer obj = (computer) new Laptop();  //Upcasting
            computer obj = new Laptop();
            obj.show();

            Laptop obj1 = (Laptop) obj; // downCasting
            obj1.show2();
    }
}
