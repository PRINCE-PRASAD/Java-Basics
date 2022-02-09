import javax.management.ValueExp;

public class part11_java_strings {
    public static void main(String[] args) {
        String name = "Hello";
        System.out.println(name);

int testvalue = name.length();
System.out.println(testvalue);
//use for check the nenght of string

String lString = name.toLowerCase();
System.out.println(lString);
// change all the string letter in small letter

String uString = name.toUpperCase();
System.out.println(uString);
// all the strings in upper case

String nonTrimmedString = "     Hello    ";
System.out.println(nonTrimmedString);
// use for non-trim or adding a space

String trimmedString = nonTrimmedString.trim();
System.out.println(trimmedString);
// use for remove space in string

System.out.println(name.substring(1));
//it will show substring which is at position 
System.out.println(name.substring(1,4));
//it will print from 1 to 3 because it will count upto 4

System.out.println(name.replace('l', 'p'));
// it help to replace by the target

System.out.println(name.replace("H", "pri"));
// it help to replace by the target

System.out.println(name.startsWith("Hel"));
// it will check does it start with....

System.out.println(name.endsWith("llo"));
// it will check does it vend with ....

System.out.println(name.charAt(4));
// it will check charater at 4th position

String testmodifiedName = "Heeelllllloooo";
// use for modify string

System.out.println(testmodifiedName.indexOf("llo"));
// it will check 1stly "llo" come in which position 

System.out.println(testmodifiedName.indexOf("lll", 3));
// it will check is "lll" avilable after 3rd string for first time or not (-1) and if avilable on which posision

System.out.println(testmodifiedName.lastIndexOf("llo", 10));
// it will check "llo" come in last time under 10th sub-string

System.out.println(name.equals("Hello"));
// it will check does string mach with pre-declare tree or not also check small and upper case also

System.out.println(name.equalsIgnoreCase("hello"));
// it will check does the string mach or not without upper and lower case



    }
}
