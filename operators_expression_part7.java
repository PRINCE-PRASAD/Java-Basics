public class operators_expression_part7 {
    public static void main(String[] args) {
        
        // arithmetic operation
        int a = 4;
        int b = 6 % a; // modulo operation return the operator;
        System.out.println(b);
        // 4.8%1.1; returns the demimal remainder
        System.out.println(4.8 % 1.1);
        // --------------------------------------------------------------------------------------------------------
        // assignment operators

        int c = 9;
        c *= 3;
        System.out.println(c);
        // ----------------------------------------------------------------------------------------------------------
        // comparasion operators

        System.out.println(64 < 6);
        // answer come in true or false

        // -------------------------------------------------------------------------------------------------------
        // logical operator

        System.out.println(64 > 5 && 64 > 98);

        System.out.println(64 > 5 || 64 > 98);

        // this will show it is true or false if single condidition not satisfied anser
        // will be false
    }
}
