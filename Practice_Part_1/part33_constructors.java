class testemploy{
    private int id ;
    private String name;

    //case 1
public testemploy(){
    id = 0;
    name = "your-name-here";
}
// case 2
public testemploy(String myName, int myId){
    id = myId;
    name = myName;
}
// case 3
public testemploy(String myName){
    id = 1;
    name = myName;
}
    
public void setName(String n) {this.name=n;}
public String getName() {return name;}
public void setid(int i) {this.id=i;}
public int getId(){return id;}

}

/**
 * part33_constructors
 */
public class part33_constructors {

    public static void main(String[] args) {
       
        // case 1

        // testemploy prince = new testemploy();
        // System.out.println(prince.getId());
        // System.out.println(prince.getName());

// case 2

        // testemploy prince = new testemploy("jaihoprinceki", 99);
        // System.out.println(prince.getId());
        // System.out.println(prince.getName());

// case 3

        testemploy prince = new testemploy("princeamarrahe");
        System.out.println(prince.getId());
        System.out.println(prince.getName());
    }
}

// here we use concept of overloading, private class using geter and seter , and constructors also for calling a class inside a calss with argument 