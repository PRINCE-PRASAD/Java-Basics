public class part15_java_relational_operator {

    public static void main(String[] args) {
        System.out.println("for logical AND");
        boolean a = true;
        boolean b = false;

        if (a && b) { /*
                       * AND operator verify does both the conditionm is true or not that means a and
                       * b is both are true or if any of the one is false then answer will be false
                       */
            System.out.println("Y"); /*
                                      * in a case of AND operator associtivity wil be left to right in a case of more
                                      * than 2 operator in a single condition
                                      */
        } else {
            System.out.println("N");
        }

        System.out.println("for logical OR...");
        if (a || b) { /*
                       * OR operator verify does any one of the conditionm is true or
                       * not that means if any of the one is true then answer will be true
                       */
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        
        /* here is for logical NOT that is inverted */
        System.out.println("for logial NOT");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);
    }

}
