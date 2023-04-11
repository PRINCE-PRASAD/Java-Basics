/**
 * MultidimentionalArray
 */
public class MultidimentionalArray {

    public static void main(String[] args) {
        int num[][] = new int[3][4];
        int random = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10); // here we have to multipy with 10 and also use the type casting
                                                        // because math.random provide the digit in double data type
                // System.out.println(num[i][j]);
            }
        }
        // for output of data(fetching) with normal loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------- Enhanced Loop--------------------------");

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}