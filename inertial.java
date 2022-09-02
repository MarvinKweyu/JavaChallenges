
//Write a function called isIntertial that accepts an integer array and returns 1 if the array is
// inertial;otherwise it returns 0.

public class inertial {
    public static void main(String[] args) {
        int[] myArray = { 2, 3, 5, 7 };
        System.out.println("Is inertial test: " + isInertial(myArray));

    }

    public static int isInertial(int[] a) {

        boolean hasOddNum = false;
        int[] oddValues = new int[a.length];
        int[] evenValues = new int[a.length];
        int largestNo = 0;

        // get odd values, even values and largest no
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenValues[i] = a[i];
            } else {
                oddValues[i] = a[i];
                hasOddNum = true;
            }

            if (largestNo < a[i]) {
                largestNo = a[i];
            }
        }

        //
        if (!hasOddNum) {
            return 0;
        }
        if (largestNo % 2 != 0) {
            return 0;
        }

        for (int k = 0; k < oddValues.length; k++) {
            for (int j = 0; j < evenValues.length; j++) {
                if (oddValues[k] < evenValues[j] && evenValues[j] != largestNo) {
                    System.out.println("checking other values");
                    System.out.println("Odd value; " + oddValues[k]);
                    System.out.println("Even value value; " + evenValues[j]);
                    System.out.println("Largest number: " + largestNo);
                    return 0;
                }
            }
        }

        return 1;

    }
}
