/**
 * Super
 */
class a {
    public a() 
    {
                // super();       // Hidden data of constructor
        System.out.println("In a Without parameters");
    }
    public a(int n) 
    {
                // super();       // Hidden data of constructor
        System.out.println("In a With parameters");
    }
}
class b extends a {
    public b() 
    {
        // super();       // Hidden data of constructor // if u pass "n" in it so it will show without parameterb and with paramerts a
        System.out.println("In b Without parameters");
    }
    public b(int n) 
    {
        // this();
        // super(n);  // it will call the super class with parameters
        System.out.println("In b With parameters");
    }
}

public class Superr {

    public static void main(String[] args) {
        
        b obj = new b();
        System.out.println("----------------Constructor with parameter-----------------------");
        b obj1 = new b(3);
    }
}
 // whenever you create the obj by default you get the constructor data 
 // Supper class is hidden in every constructor class
 // if u wan't data with both parametrize result of a and b  then write parametrize super class inside perametrize constructor of b
 // "this()" call the constructor of same class then that contructor call their supr class