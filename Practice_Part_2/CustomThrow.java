
class PrinceException extends Exception {
    public PrinceException(String string) {
        super(string); // for passing the message in the exception
    }
}

public class CustomThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new PrinceException("i dont want to print zero");
        } catch (PrinceException e) {
            j = 18 / 1;
            System.out.println("this is default exception" + e);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.err.println("Bye");
    }
}
