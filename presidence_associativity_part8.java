public class presidence_associativity_part8 {
    public static void main(String[] args) {
        // presidence & associativity
        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
        /*
         * highest presidence goes to * and / .they are then evaluated on the basics of
         * left to right associativity
         * =30-34/2
         * =30-17
         * =13
         */
        int b = 60 / 5 - 34 * 2;
        System.out.println(b);
        /*
         * =12-34*2
         * =12-68
         * =--56
         */

        // quiz
        int x = 6;
        int y = 7;
        int k = x * y / 2;
        System.out.println(k);

    }
}
