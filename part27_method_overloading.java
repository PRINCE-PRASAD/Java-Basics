public class part27_method_overloading {

    static void tryy() {     /* here the parameters is blank */
        System.out.println(" ");
        System.out.println("i dont have any integer in my ");
    }

    static void tryy(int a) {    /* here int is the parameters */
        System.out.println(" ");
        System.out.println("helloo world " + a + "have a good day");
    }

    static void tryy(int a, int b) {    /* here int is the parameters */
        System.out.println(" ");
        System.out.println("helloo world " + a + "have a good day");
        System.out.println("helloo dunia " + b + "have a good day");
    }

    static void tryy( int a, int b, int c) {/* here int is the parameters */
        System.out.println(" ");
        System.out.println("helloo World " + a + "have a good day");
        System.out.println("helloo Sis " + b + "have a good day");
        System.out.println("helloo Bro " + c + "have a good day");
    }

    // static int tryy( int a, int b, int c) {/* here int is the parameters */
    //     System.out.println(" ");
    //     System.out.println("helloo World " + a + "have a good day");
    //     System.out.println("helloo Sis " + b + "have a good day");
    //     System.out.println("helloo Bro " + c + "have a good day");
    // }

    public static void main(String[] args) {
        tryy();
        tryy(3000);                 /* here 3000 is an argument */
        tryy(2525, 858);           /* here 2525 , 858 are argument */
        tryy(5858, 8856, 8988);   /* here 5858, 8856, 8988 are argument */

    }
}
 // In this overloading if u pass single argument in main then it will run  only that (method or function) in which single parameter is passed.
 // same if u pass double argument in main then it will run only that (method or function) in which double parameter is passed.
 // void is use where function not returm any thing.
 // u can not write same method or funtion in overloding by using void and int at a same time it will show error like last method or function.