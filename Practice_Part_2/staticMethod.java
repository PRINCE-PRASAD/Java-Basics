class Mobile
{   
    String brand;
    int price;
    static String name; 

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name); 
    }

    public static void show1(Mobile obj) // for access the non static variable that used in this class we has write class name with object 
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name); // You can use static variable(name) in static method but u cannot use non static variable(Price, brand) in static method.
    }
}


public class staticMethod {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1100;
        Mobile.name = "SmartPhone";


        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // here we show how we acess th satic variable and class
    }
}
