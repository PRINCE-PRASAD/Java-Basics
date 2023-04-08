import java.util.Scanner;

public class part10_practice {

    public static void main(String[] args) {
        /*
         * What will be the result of the following expression:
         * float a = 7/4 * 9/2
         */

        float a = 7 / 4 * 9 / 2;
        System.out.println(a);
        /*
         * here u get anser 4.0 which is a wrong answer because here multiply happens
         * between two integer then the answer will also be integer but just because we
         * write float in varible then it give answer in float for example if answer is
         * 4.875 it will 4 as answer but because we write float it will give 4.00 as
         * answer that is a wrong answer
         */

        float b = 7 / 4.0f * 9 / 2.0f;
        System.out.println(b);
        // here multiply happen in floatpoint and accorind to the presedence
        // -------------------------------------------------------------------------------------------------------
        // Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show
        // the correct grade.

        char testgrade = 'b';
        testgrade = (char) (testgrade + 8);
        System.out.println(testgrade);

        // here is orignal grade
        testgrade = (char) (testgrade - 8);
        System.out.println(testgrade);

        // -------------------------------------------------------------------------------------------------

        // Find the value of 'a' in expression given below

        System.out.println(7 * 49 / 7 + 35 / 7);

        // ------------------------------------------------------------------------------------
        // Use comparison operators to find out whether a given number is greater than
        // the user entered number or not.

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(d > 8);

    }
}
