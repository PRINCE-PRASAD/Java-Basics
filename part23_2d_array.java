/**
 * part23_2d_array
 */
public class part23_2d_array {

    public static void main(String[] args) {
        int [][] flats;
        flats = new int [2][4];
        flats[0][0] =101;
        flats[0][1] =102;
        flats[0][2] =103;
        flats[0][3] =104;
        flats[1][0] =105;
        flats[1][1] =106;
        flats[1][2] =107;
        flats[1][3] =108;

        System.out.println("printing the 2d array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
                
            }
            System.out.println(" ");
        }
    }
}