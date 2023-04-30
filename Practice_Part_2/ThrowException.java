public class ThrowException {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
        if(j==0)
        throw new ArithmeticException("i dont want to print zero");
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("this is default exception" + e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);

        System.err.println("Bye");

    }
}
// throw is use to throw the Exception and catch block will catch it 
// also use in to message the exception 