import java.util.Scanner;

public class part22_array_with_loop {

    public static void main(String[] args) {
        String[] student = { "prince", "ayush", "kushal", "raj", "sagar", "kulsum", "iqra" };
        System.out.println(student[3]);
        System.out.println(student.length);

        float[] marks = { 45.5f, 78.6f, 46.5f, 47.9f, 58.8f };
        System.out.println(marks[3]);
        System.out.println(marks.length);

        int[] number = { 76, 66, 86, 56, 12, 45 };

        // displaying numbers in old/native way
        System.err.println("printing the array in old way");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);

        // displaying number via loop method
        System.out.println("displaying number via loop method");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        // displaying number in reverse order
        System.out.println("displaying number in reverse order");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }

        // displaying the array {for each loop}
        System.out.println("Printing using  for-each loop");
        for (int element : number) {
            System.out.println(element);
        }

        // ---------------------------------------------------------------------------------------------------

        float per = 0;
        float sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of total subject");
        int a = sc.nextInt();

        System.out.println("enter the total no per subject");
        int c = sc.nextInt();

        float[] totalsub = new float[a];

        for (int i = 0; i < totalsub.length; i++) {
            System.out.printf("enter the number of subject %d ", i + 1);
            totalsub[i] = sc.nextFloat();
            sum = sum + totalsub[i];
            per = (sum / (c * a)) * 100;
        }
        System.out.println(per);

    }
}