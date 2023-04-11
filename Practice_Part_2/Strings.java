public class Strings {
    public static void main(String[] args) {

        // String name = new String("Prince");
        String name = "Prasad";

        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello! " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Happy"));

        String name1 = "Sagar";
        name1 = name1 + " Shaw";
        System.out.println("Hello " + name1);

        String s1 = "Kushal";
        String s2 = "kushal";
        // here string does not make 2 object in heap memory string are constrains so s1 will create the obj in heap at particular address and s2 will strore that address 
        System.out.println(s1==s2);
  
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //it will show the capcity of the string by default it is 16

        StringBuffer tb = new StringBuffer("Prince");
        System.out.println(tb.capacity()); // now the capcity is (string no. + 16) = 22 extra for future modification

        System.out.println(tb.length()); // show the length

        tb.deleteCharAt(3); // delete the char

        tb.insert(0, "Holla, " ); // At index zero of tb string it will insert data 

        tb.setLength(50); // set the length of string  

        System.out.println(tb.length());

        tb.append(" Prasad"); // for append the data in StringBuffer

        System.out.println(tb);


    }
}

// Difference between String buffer and string builder
// String buffer is thread safe and string builder is not 