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


    //  -------------------------------------------------------
    // created two function int and array  

    //case - 1 for int
    static void change(int p){
        p=45;
    }
// case - 2 for array
    static void change1(int [] arr){
        arr[0]= 98;
    }
    // ---------------------------------------------------------


//-----------------------------------------------------------------------------
    // old way for doing a similar job by using different variable
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

//---------------------------------------------------------------------------------------
        // case 1
        int o = 85;
        change(o);
        System.out.println("the value of o after running change is: " + o);

        // case 2
        int [] marks = {45, 89, 23, 96, 33, 66};
        System.out.println("the value of array [0] after running the change1 is: " + marks[0]);

    }
}
// conclusion - In case 1 ("int") the value remain same as written in main "o=85".
// but in case 2 ("array") the value of array "marks[0]" has changed as per the static function call or method call where marks[0]= 45;