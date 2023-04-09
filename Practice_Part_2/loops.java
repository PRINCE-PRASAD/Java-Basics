/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        int i = 1;
        int k = 1;

        // whenever the while condition true it will continues the loop
        // ------------------------ For while Loop --------------------------
        
        System.out.println("-----------------------------------");
        while (k < 5) {
            System.out.println("Hello " + k);
            k++;
        }

        // ----------------------For Nested While Loop ----------------------

        System.out.println("-----------------------------------");
        while (i < 4){
            System.out.println("Hello now You Say Hi Twice");
            i++;
            int j=1;
            while(j<3){
                System.out.println("Hi, Now you Continue");
                j++;
            }
        }

        // ------------------------- For do while Loop ---------------------
        // The main difference between while and do while is if it get fale it run atleast 1 time 
        System.out.println("-----------------------------------"); 
        int l = 8; //worng condition given
        do {
            System.out.println("i am Do While loop and My codition is false " + l);
            l++;
        }while (l < 5);

        // ----------------------------------For Loop ---------------------------------------

        System.out.println("-----------------------------------");
        for(int m=4; m>=1; m--){
            System.out.println("Tic-Tic " + m );
        }

        //---------------------------Nested For Loop -----------------------------------
        System.out.println("-----------------------------------");
        for(int n=1; n<=5; n++){
            System.out.println("Day " + n );
            for(int o=0; o<=5; o++){
                System.out.println((o+9) +"Hr" + "-" + (o+10) + "Hr");
            }
        }
    }
}