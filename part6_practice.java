import java.util.Scanner;

public class part6_practice {
    public static void main(String[] args) {
        // problem 1
        int a = 4;
        int b = 15;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);

        // problem 2
        float sub1 = 45;
        float sub2 = 48;
        float sub3 = 78;
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println(cgpa);

        // problem 3
        // System.out.println("kindliy enter your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("good morning " + name + " have a good day");

        // problem 4
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        // it is program of wheathr the name is integer or not

    }
}
