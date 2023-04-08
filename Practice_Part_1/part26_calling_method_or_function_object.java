public class part26_calling_method_or_function_object {

    int logic(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x - y) * 6;
        }
        return z;
    }

    public static void main(String[] args) {

        part26_calling_method_or_function_object obj = new part26_calling_method_or_function_object();
        int u = 10;
        int h = 15;
        int e;
        e = obj.logic(u, h);
        System.out.println(e);
    }
}
// Conclusion-: Here logic is the function inside the class "part26_calling_method_or_function_object" and we need this function inside the  class "public static void main(String[] args)" so we call this class as object in our main class then write |obj."function that we need"|in our main class.
// if u don't use static u have to create object for using that function or method.