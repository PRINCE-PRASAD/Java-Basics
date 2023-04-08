class kingkong{
    private int id;  //here if i use private class used
    private String name;

    public void setName(String n){     // u can also use setter and getter as validation fot its data type ("whether it is string or int or float") 
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    } 
    public int getId(){
        return id;
    }
}

public class part32_access_modifiers_getters_setter {
    public static void main(String[] args) {
        kingkong pisu = new kingkong();

        pisu.setName("Aditya");
        pisu.setId(8864);
        System.out.println(pisu.getName());
        System.out.println(pisu.getId());
    }
}
