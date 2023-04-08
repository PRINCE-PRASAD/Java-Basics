/**
 * part30_custom_class
 */

class Strugler {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name " + name);
        // System.out.println(" my salary " + salary);
    }

    public int getIncome() {
        return salary;
    }
}

public class part30_custom_class {

    public static void main(String[] args) {
        System.out.println("All this code done vai custom class");
        Strugler prince = new Strugler(); // instanting a new Strugler or create a object
        Strugler kushal = new Strugler(); // instanting a new Strugler or create a object

        // setting Attribute for prince
        prince.id = 887;
        prince.salary = 87;
        prince.name = "jai ho guru";

        //// setting Attribute for kushal{id/salary}
        kushal.id = 887;
        kushal.salary = 87;
        kushal.name = "prince mahan hai";

        // printing the Attributes
        prince.printDetails();
        kushal.printDetails();

        int salary = prince.getIncome();
        System.out.println(salary);

    }
}