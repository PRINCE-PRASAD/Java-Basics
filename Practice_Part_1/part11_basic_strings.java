import java.util.Scanner;

public class part11_basic_strings {
    public static void main(String[] args) {

        
          String name = new String("Prince");
          
          // or there is one more way
          String namea = " Rahul";
         
          System.out.print("the name is:  ");
          System.out.print(name);
         System.out.print(namea);
         
        // ln provide a new line in print option
        // -----------------------------------------------------------------------------------------------------

        int a = 5;
        float b = 8.4f;
        System.out.printf("the value of a is %d and value of b is %f", a, b);
        System.out.format("the value of a is %d and value of b is %8.2f", a, b);
        System.out.println( "just for new line");
        // if u use prinf or format he c concept will also work but it dont provide any
        // space println provide work in new line
        // if u want to use space u can write %8.5f/d or any think else
        
        // ------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        //String st = sc.next();
        // for only word

         String st = sc.nextLine();
        // for total line

        System.out.println(st);

        // type in terminal it will return same
    }
}
