/*
 * Find the square root of a number without built-in functions
 * 
 */

public class squareRoot {

    public static void main(String[] args) {
        // ? thought , find the number using a binary search
        System.out.println("the square root of 9 is: " + findRoot(25));
        System.out.println("The power of: " + power_value(3, 2));

    }

    public static int findRoot(int num) {

        // ToDo: find the the absolute value without abs
        // compare = (compare <= 0.0F) ? 0.0F - compare : compare;
        // float compare = (float) guess * guess - num;
        int guess = 1;

        while (0.0001 < Math.abs(guess * guess - num)) { // how close is it to the true result
            guess = (guess + num / guess) / 2; // Newton's method to get ever closer to the true value
        }

        return guess;
    }

    public static double findRoot2(int number) {
        // Proceeding to find out square root of the number
        double guess;
        double squareRoot = number / 2;
        do {
            guess = squareRoot;
            squareRoot = (guess + (number / guess)) / 2; // Newton's method
        } while ((guess - squareRoot) != 0);

        return squareRoot;

    }

    public static int power_value(int base, int power) {
        /*
         * Find the power of an integer
         */
        int sum = 1;

        for (int i = 0; i < power; i++) {
            sum *= base;

        }
        return sum;

    }

    public static int multiple_arity(int... value) {
        return 10;

    }
}
