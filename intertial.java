
//Write a function called isIntertial that accepts an integer array and returns 1 if the array is
// inertial;otherwise it returns 0.

public class intertial {
    public static void main(String[] args) {
        int[] myArray = { 2, 4, 6, 8, 10 };
        System.out.println("Is inertial test: " + isInertial(myArray));

    }

    public static int isInertial(int[] a) {

        boolean oddValue = false;
        boolean maxValEven = false;
        boolean oddValsGreaterEven = true; // except largest

        int maxVal = 0;
        int[] evenNos = new int[a.length];

        // find odd values
        for (int item : a) {
            if (item % 2 != 0) {
                oddValue = true;
                break;
            }
        }

        // get max value
        for (int item : a) {
            if (item > maxVal) {
                maxVal = item;
            }
        }

        // check even max value
        if (maxVal % 2 == 0) {
            maxValEven = true;
        }

        // check odd values are greater than all even except the largest number which
        // should not be even

        // 1. Collect all even
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenNos[i] = a[i];
            }
        }

        for (int item : a) {
            if (item % 2 != 0) {
                for (int evenVal : evenNos) {
                    if (maxValEven) {

                        if (item < evenVal & evenVal != maxVal) {
                            oddValsGreaterEven = false;
                            break;
                        }
                    }
                }
            }

        }

        // System.out.println("\nOdd value:" + oddValue + " \n Is maximum value even: "
        // + maxValEven
        // + " \n Are odd values greater than even: " + oddValsGreaterEven);

        if (oddValue && maxValEven && oddValsGreaterEven) {
            return 1;
        }

        return 0;
    }

}
