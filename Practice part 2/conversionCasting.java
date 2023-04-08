/**
 * conversionCasting
 */
public class conversionCasting {
public static void main(String[] args) {

    // --------------------case1-------------------
byte b = 126; 
int a = b;
System.out.println(a);
// it is example of conversion 
// if value of b is greater than 127 it will provide error
// it will not provide a error because int is bigger data type than byte

// --------------------------case2----------------------
// int l = 12; 
// byte p = l;
// System.out.println(l);
// if u check this code it will provide error because it is not possible to convert from byte to int directly due to its size

int l = 12; 
byte p = (byte)l;
System.out.println(p);
// it will not give any error because we use "casting" method here

int q = 258; 
byte w = (byte)q;
System.out.println(w);
//  when we provide the bigger value to the byte then it find the modulus which means it will divide this number with byte range and write the reminder of it

float f = 5.6f;
int o = (int)f;
System.out.println(o);
// here in this casting we lost some data which is in  decimal
// -------------------case3------------------------

}
    
}