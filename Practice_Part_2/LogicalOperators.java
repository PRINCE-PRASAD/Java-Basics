/**
 * LogicalOperators
 */
public class LogicalOperators {

    public static void main(String[] args) {

        int x =9;
        int y =5;
        int a = 2;
        int b = 6;
         
        boolean result = x>y && a>b; // AND opeartion both condition should be True.
        System.out.println(result);

        boolean result1 = x>y || a>b; // OR operation any one condition should be True;
        System.out.println(result1);
        
        boolean result2 = x<y || a>b || a>1; // OR operation any one condition should be True;
        System.out.println(result2);

        boolean result3 = x<y;
        System.out.println(result3);

        boolean result4 = x<y;     // because of not symbol it will give opposite value 
        System.out.println(!result4);

        




    }
}