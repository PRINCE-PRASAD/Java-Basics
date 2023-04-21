enum AppStatus{  // it works like class
    Running, Failed, Pending, Success // this work as the object of the class
}

public class Enumeration {
    public static void main(String[] args) {

        AppStatus s = AppStatus.Pending;
        System.out.println(s);
        System.out.println(s.ordinal()); // odinals function help in show the array numbers

        AppStatus[] ss= AppStatus.values();
        for (AppStatus a:ss){    // inhance for loop
            System.out.println(a);
        }

        for (AppStatus a:ss){
            System.out.println(a + " : " + a.ordinal());
        }
    }
}
// it mainly use in the declearing the constaints