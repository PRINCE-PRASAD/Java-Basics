public class part19_do_while_loop {
    public static void main(String[] args) {
        // for infinity loop
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        // --------------------------------------------------------------
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);
        // ----------------------------------------------------------
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 45);

    }
}