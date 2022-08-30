// Write a method named isDivisible that takes an integer array and a divisor and returns 1 if all its elements are divided
// by the divisor with no remainder. Otherwise it returns 0.

public class isDivisibleClass {
    public static void main(String args[]) {
        int[] myArray = { 6, 12, 24, 36 };
        System.out.println("The array is divisible: " + isDivisible(myArray, 12));

    }

    public static int isDivisible(int[] a, int divisor) {

        if (a.length == 0) {
            return 1;
        }

        for (int num : a) {
            if (num % divisor != 0) {
                return 0;
            }
        }

        return 1;

    }

}
