import java.util.Scanner;

public class part16_elseif_switch {
    public static void main(String[] args) {
        // -------------------------------------------------------------------------------------------------------
        // int marks;
        // System.out.println("Tell me about your marks");
        // Scanner sc = new Scanner(System.in);
        // marks = sc.nextInt();
        // if (marks > 90) {
        // System.out.println("you are a awesome student");
        // } else if (marks > 80) {
        // System.out.println("you are a great student");
        // } else if (marks > 70) {
        // System.out.println("you are a good student");
        // } else if (marks > 50) {
        // System.out.println("you are a moderate student");
        // } else if (marks > 1) {
        // System.out.println("you are a bad student");
        // } else {
        // System.out.println("you are not given exam");
        // }
        // -------------------------------------------------------------------------------------------------------
        // this is not tradisional swich case method here we dont use break

        String var = "sagar";

        switch (var) {
            case "sagar" -> {
                System.out.println("you are a mad doctor");
                System.out.println("you are a mad person");
                System.out.println("you are not a human");
            }
            case "ayush" -> System.out.println("you are preparing for goverment  job");
            case "raj" -> System.out.println("you re styuding in nit but you are litte arogent in nature");
            default -> System.out.println("i donn't know you");
        }
        System.out.println("thanks for using my java code!");

        // ---------------------------------------------------------------------------------------------------
        // tradisional way of switch and case

        /*
         * switch (key) {
         * case value:
         * //code
         * break;
         * //code
         * default:
         * break;
         * }
         */

    }

}
