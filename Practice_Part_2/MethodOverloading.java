/**
 * MethodOverloading
 */

 class check {
    public int add (int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int add (int n1, int n2){
        return n1 + n2;
    }

    public double add (double n1, int n2){
        return n1+n2;
    }
 }
public class MethodOverloading {

    public static void main(String[] args) {
        check obj = new check();
        int r1 = obj.add(3, 4);
        int r2 = obj.add(4,9,5);
        System.out.println("answer for first is " + r1);
        System.out.println("answer for first is " + r2);
    }
}

// Here in overloading the name of method are same but the paramerer inside the method can be different 
// thats why it dont prvide any error with same name 