/*
 * This program determines if a number is prime
 */
public class findPrime {
    public static void main(String[] args) {
        boolean isPrime = false;
        int number = 21;
        // if (number < 2) {
        // isPrime = false;

        // } else {

        // for (int i = 2; i <= number / 2; i++) {
        // System.out.println("The number" + i + "is now 7: " + number % 7);
        // if (number % i != 0) {
        // if (i == 7) {
        // System.out.println("21 is divided by7 leaving a remainder " + number % 7);
        // }
        // isPrime = true;
        // } else {
        // isPrime = false;
        // }
        // }
        // }
        System.out.println("The number " + number + " is prime: " + isPrimeNumber(number));
    }

    private static boolean isPrimeNumber(int number) {

        // number should be greater than 1
        if (number < 2)
            return false;

        for (int i = 2; i < number / 2; i++) {

            // if number is perfectly divisible, it is not prime
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
