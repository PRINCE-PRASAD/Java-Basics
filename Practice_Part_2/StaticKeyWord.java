class Mobile
{   // Instance variable
    String brand;
    int price;
    // String name
    static String name; // if do type static then you can't modify it and variable is same and shared for everyone like line 31 "phone"

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name); // local variable
    }
}


public class StaticKeyWord {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";
        // obj1.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1100;
        Mobile.name = "SmartPhone";
        // obj2.name = "Phone";

        // obj1.name = "Phone";
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
