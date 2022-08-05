/*
 * This program returns the number of prime numbers between a range
 */

public class PrimeCounter {
    public static void main(String[] args) {

        int start = 10;
        int end = 30;
        int numberOfPrimes = 0;

        for (int i = start; i < end + 1; i++) {
            if (isPrime(i)) {
                numberOfPrimes += 1;
            }
        }

        System.out.println("the number of primes is: " + numberOfPrimes);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            // if number is perfectly divisible, it is not prime
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
