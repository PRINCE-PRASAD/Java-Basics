import java.util.Scanner;

/**
 * part24_practice_array
 */
public class part24_practice_array {

    public static void main(String[] args) {

        // create an array of 5 float and calculate their sum
        /*
         * float sum = 0.0f;
         * float[] marks = { 54.8f, 87.7f, 96.8f, 86.5f, 85.6f };
         * for (int i = 0; i < marks.length; i++) {
         * sum = sum + marks[i];
         * }
         * System.out.println(sum);
         */
        // -----------------------------------------------------------------------------
        // write a progeam to search wheather a given array is present in array or not
        /*
         * Scanner sc = new Scanner(System.in);
         * int [] number = {54, 85, 56, 68, 93, 95};
         * System.out.println("enter the no ");
         * int a = sc.nextInt();
         * for(int i=0; i<number.length; i++)
         * {
         * if (a==number[i]) {
         * System.out.printf("this no exist in this array at %d ",i+1);
         * 
         * }
         * else{
         * System.out.println("this no doesn't exist");
         * 
         * }
         * }
         */
        // -------------------------------------------------------------------------------
        // int a, b;
        Scanner sc = new Scanner(System.in);
        int[][] number;
        System.out.println(" enter the value of x(Row) and y(Column)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        number = new int[a][b];
        for (int i = 0; i < number.length; i++) {
            System.out.println(" ");
            System.out.printf("enter value of %d", i);
            number[i] = sc.nextInt();
            for (int j = 0; j < number[i].length; j++) {
                System.out.printf("enter value of %d", j);
                number[j] = sc.nextInt();
            }
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.printf("%4d", number[i][j]);
            }

        }
    }
}
