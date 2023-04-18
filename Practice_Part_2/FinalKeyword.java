// final class A{
//     public void name() {
//         System.out.println("This class is final you can not extend it");
//     }
// }

// class B extends A{    //It will give err beclse here class a is final 
// public void name() {
//     System.out.println("It will give u err because it extends final class");
// }
// }

// ------------------------------------------------------------------------------------------------------------------


// public class FinalKeyword {
//     public static void main(String[] args) {
//         final int num = 9;
//          num = 8;   // it will give error because we already declear this as final 
//     }
// }


//------------------------------------------------------------------------------------------------------------------

class A{
public final void owner() {
    System.out.println("thi si own by Prince");
}
}
class C extends A {
public void owner() {            // Here u cannot re define the method once it declear the final it also use to stop overridev 
    System.out.println(" you can not re define the object");
}
}

/**
 * FinalKeyword
 */
public class FinalKeyword {

    public static void main(String[] args) {
        
    }
}

// final method, keyword, class