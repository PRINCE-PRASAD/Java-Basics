/**
 * ConditionalStatement
 */
public class ConditionalStatement {

    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;
        System.out.println("---------------use of if--------------------");
        if(x>5 && x<10) //if both condition are true 
        System.out.println("everything is ok");
        else
        System.out.println("bye");


        System.out.println("---------------use of else--------------------");
         
       
        if(x>y)
        {
            System.out.println(x);
            System.err.println("thanks for help");
        }
        else
        System.out.println(y);


        System.out.println("------------use of else if-----------------------");

        if (x>y && x>z)
        System.out.println(x);

        else if(y>z)
        System.out.println(y);

        else 
        System.out.println(z);
    }
}