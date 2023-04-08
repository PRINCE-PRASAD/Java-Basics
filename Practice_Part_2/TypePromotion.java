/**
 * TypePromotion
 */
public class TypePromotion {

    public static void main(String[] args) {
        byte a = 100;
        byte b = 50;
        int result = a*b;
        System.out.println(result);
    }
}
// here byte mltiplyed byte result will be also byte
// but the result exceds the limt of byte data type 
//so java promoted the result without any conversion and casting