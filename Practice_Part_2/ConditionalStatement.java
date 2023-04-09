/**
 * ConditionalStatement
 */
public class ConditionalStatement {

    public static void main(String[] args) {
        int x = 8;
        int y = 7;

        if(x>5 && x<10) //if both condition are true 
        System.out.println("everything is ok");
        else
        System.out.println("bye");


        System.out.println("-----------------------------------");
       
       
        if(x>y)
        {
            System.out.println(x);
            System.err.println("thanks for help");
        }
        else
        System.out.println(y);
    }
}