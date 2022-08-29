// A perfect number is one that is the sum of its factors, excluding itself. 
// The 1st perfect number is 6 because 6 = 1 + 2 + 3. The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 + 14. 
// The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. 
// In each case, the number is the sum of all its factors excluding itself.
// Write a method named henry that takes two integer arguments, i and j and returns the sum of the ith and jth perfect numbers. 
// So for example, henry (1, 3) should return 502 because 6 is the 1st perfect number and 496 is the 3rd perfect number 
// and 6 + 496 = 502.
public class henryClass {
    public static void main(String args[]) {

    }

    public static int henry(int i, int j) {
        int result = 0;

        // find factor of a number
        for(int item = 0; item < 60; item++){
            if(60 % item == 0){
                
            }
        }
        // find ith factor
        int count = 0;
        int factori = 0;
        while (i <= count) {
            if (count == i) {
                return factori;
            }
            count++;
        }
        return result;
    }
}
