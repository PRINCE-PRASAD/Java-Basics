import javax.naming.spi.DirStateFactory.Result;

/**
 * TernaryOperater
 */
public class TernaryOperater {

    public static void main(String[] args) {
        int n = 4;
        int result = 0;

    // for odd and even problem

    if(n%2==0)
        result = 1000;
    else
        result = 2000;

     System.out.println(result);

        // using Ternary Operator  

    result = n%2==0 ? 1000 : 2000;

    System.out.println(result);
    }
}