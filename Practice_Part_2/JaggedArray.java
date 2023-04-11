/**
 * JaggedArray
 */
public class JaggedArray {

    public static void main(String[] args) {
        int num1[][] = new int[4][]; // inisilizing the size array
        
        num1[0] = new int [3]; // inisilizing the 2d size array
        num1[1] = new int [1]; 
        num1[2] = new int [2];
        num1[3] = new int [3];

        for (int i=0; i<num1.length; i++){
            for (int j=0; j<num1[i].length; j++){  // here for loop can work = value of num1 
                num1[i][j] = (int) (Math.random() * 10); // update the value of array using math.random

            }
        }

        System.out.println("------------- Enhanced Loop--------------------------");

        for (int n[] : num1) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}