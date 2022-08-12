import javax.security.auth.login.LoginContext;

public class part25_method_or_function {
    // if u decleare a function inside a class it called methods
    // if u write static it means u don't have create new object for using that functon
    // declearing a function or method for new way
    static int logic(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x - y) * 6;
        }
        return z;
    }

    // old way for doing a similar job in different variable
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c;
        if (a < b) {
            c = a + b;
        } else {
            c = (a - b) * 6;
        }
        System.out.println(c);

        int a1 = 8;
        int b1 = 6;
        int c1;
        if (a1 < b1) {
            c1 = a1 + b1;
        } else {
            c1 = (a1 - b1) * 6;
        }
        System.out.println(c1);
        // -----------------------------------------------------------------------------

        // new way or by using function/method we can do same thing by declaring once
        int u = 10;
        int h = 15;
        int e;
        e = logic(u, h);
        System.out.println(e);
    }
}
