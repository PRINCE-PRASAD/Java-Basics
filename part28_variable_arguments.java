/**
 * part28_variable_arguments
 */
public class part28_variable_arguments {

static int add(int ...arr){  /*here "..." is a variable argument that tell us arr is array  that have zero or more arguments */
    int result = 0;
    for (int a : arr){
        result = result + a;
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(4,8,9));
        System.out.println(add(9,2,3));
    }
}