/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int num[] = {5,6,9,3};
        System.out.println(num[2]); // here it will show result 9

        
        num[2]=11; // updating the value
        System.out.println(num[2]); // now it will show 11


        // --------------------for dynamic array-------------

        int nums [] = new int[4]; // initializing the size of array 
        // --store the value-----
        nums[0]= 7;
        nums[1]= 9;
        nums[2]= 5;
        nums[3]= 1;
        // for Output of the array ue use loop 
        for(int i=0; i<4; i++){
            System.out.println(nums[i]);
        }

    }
}