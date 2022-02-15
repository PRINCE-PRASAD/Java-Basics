public class part15_java_relational_operator {

    public static void main(String[] args) {
    System.out.println("for logical AND");
    boolean a = true;
    boolean b = false;

    if (a && b){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }
    System.out.println("for logical or...");
    if (a || b){
        System.out.println();
    }
    else{
        System.out.println("N");
    }

    System.out.println("for logial not");
    System.out.println("Not(a) is");
    System.out.println(!a);
    System.out.println("Not(b) is");
    System.out.println(!b);
    }
    
}
// incomplete right now 