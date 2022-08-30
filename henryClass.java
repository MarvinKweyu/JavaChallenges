// A perfect number is one that is the sum of its factors, excluding itself. 
// The 1st perfect number is 6 because 6 = 1 + 2 + 3. The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 + 14. 
// The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. 
// In each case, the number is the sum of all its factors excluding itself.
// Write a method named henry that takes two integer arguments, i and j and returns the sum of the ith and jth perfect numbers. 
// So for example, henry (1, 3) should return 502 because 6 is the 1st perfect number and 496 is the 3rd perfect number 
// and 6 + 496 = 502.

// BUG: I cannot find the factor of the ith or jth number
public class henryClass {
    public static void main(String args[]) {
        System.out.println("The result is: " + henry(60, 3));

    }

    public static int henry(int i, int j) {
        int result = 0;

        // find ith factor
        int count = 0;
        int factorOfI = 0;
        int number = 2;
        while (count <= i) {
            if (count == i) {
                break;
            }

            for (int item = 1; item < number; item++) {

                if (number % item == 0) {
                    int sumOfI = 0;
                    System.out.println("Factor  found: " + item);
                    // item is a factor
                    if (item != number) {
                        sumOfI += item;
                    }
                }
            }
            count++;
            number++;
        }

        // System.out.println(sumOfI);
        return result;
    }
}
