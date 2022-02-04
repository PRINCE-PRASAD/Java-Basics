import java.util.Scanner;

public class exercise_average_part5 {
    public static void main(String[] args) {
        System.out.println("for persentage calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number");
        float x = sc.nextInt();
        System.out.println("Enter the number of 1st subject");
        float a = sc.nextInt();
        System.out.println("Enter the number of 2nd subject");
        float b = sc.nextInt();
        System.out.println("Enter the number of 3rd subject");
        float c = sc.nextInt();
        System.out.println("Enter the number of 4th subject");
        float d = sc.nextInt();
        System.out.println("Enter the number of 5th subject");
        float e = sc.nextInt();
        float sum = a+b+c+d+e;
        float averagey = ((sum / x) * 100);
        System.out.println("your persentage is - ");
        System.out.println(averagey);
}
}