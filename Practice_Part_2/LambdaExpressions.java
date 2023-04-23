
/*
@FunctionalInterface
interface A {
    void hello();
}

class B implements A {
    public void hello() {
        System.out.println("hello World");
    }
}

public class LambdaExpressions {

    public static void main(String[] args) {
        
        A obj = new B();
        obj.hello();
    }
}
*/
// Normaly show the output
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
interface A {
    void hello();
}

public class LambdaExpressions  {

    public static void main(String[] args) {

        A obj = new A() {
            public void hello() {
                System.out.println("hello World");
            }
        };
        obj.hello();
    }
}
*/
// Inhancely show the output
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
@FunctionalInterface
interface A {
    void hello();
}

public class LambdaExpressions {

    public static void main(String[] args) {

        A obj = () ->  
        {
            System.out.println("hello World");
        };
        obj.hello();
    }
}
*/
// Show output using Lambda 
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
@FunctionalInterface
interface A {
    void hello( int i, int j);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        
        A obj = (i ,j) ->  
        {
            System.out.println("hello World " + i + j);
        };
        obj.hello(5, 7);
    }
}*/
// Show output using Lambda  with parameters
///////////////////////////////////////////////////////////////////////////////////////////////////////////
@FunctionalInterface
interface A {
    int add( int i, int j);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        
        A obj = (i ,j) ->  i+j;
        int result = obj.add(5, 6);
        System.out.println(result);
    }
}
// Show output using Lambda with parameters with return type 
//  lamda use only in FunctionalInterface