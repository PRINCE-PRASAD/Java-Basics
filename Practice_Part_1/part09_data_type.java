public class part09_data_type {
    public static void main(String[] args) {
        /*
         * byte + short = integr
         * short +integer = integer
         * long + float = float
         * integer + float = float
         * character + integer = integer
         * character + short = integer
         * long + double = double
         * float + double = double
         */

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        // Incriment and Decriment operator
        int i = 10;
        int j = 20;
        System.out.println(i++);
        // here it first print the value then incriment the value of x
        System.out.println(i);
        // print the current value of i afer the incriment
        System.out.println(++i);
        // ther firsty incriment is done then print the value of i
        System.out.println(i);
        // print the current value of i afer the incriment

        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);

        int w = 7;
        System.out.println(++w * 8);
        // here firstly incriment done then multiply by 8
        
        char ch = 'a';
        System.out.println(++ch);
        // here incrimet happens first then print the value  

    }
}
