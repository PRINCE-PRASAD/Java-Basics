/**
 * part29_recursion
 */

 // recursion is a technique using function that calls itself one or more times until a specified condition is met
public class part29_recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    
// this iterative approach for the factorial 
static int factorial_iterative(int n){
    if (n==0 || n==1) {
        return 1;
    } 
    else {
        int product = 1;
            for(int i=1; i<=n; i++){
                product *= i;
            }        
            return product;
        }
}

    

    public static void main(String[] args) {
        int x = 5;
        System.out.println("the value of factorial x is " + factorial(x));
        System.out.println("the value of factorial x via iterative is " + factorial_iterative(x));
    }
}