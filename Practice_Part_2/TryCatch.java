/**
 * TryCatch
 */
public class TryCatch {

    public static void main(String[] args) {

        // int i = 0;  // for first error 
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("canot devide with zero" + e); ///e use to show the exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("yuup error occer");
        }
        catch(Exception e){
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}

// we use try catch block if error or exception found in try catch block it will
// exeute the next line also.
// whatever exception found it will run according to that catch