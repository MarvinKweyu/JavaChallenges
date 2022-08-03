/*
 * This program returns the number of prime numbers between a range
 */
class Counter {
    int primeCount(int start, int end) {
        int numberOfPrimes = 0;
        for (int i = start; i < end; i++) {
            if (end % i != 0) {
                System.out.println("value is: " + i);
                numberOfPrimes += 1;
            }
            // this number should not be less than 2
            if (i < 2) {
                continue;
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j != 0) {
                    numberOfPrimes += 1;
                    System.out.println("This " + i + " is prime");
                }
            }

        }
        return numberOfPrimes;

    }
}

public class PrimeCounter {
    public static void main(String[] args) {
        // Counter result = new Counter();

        // System.out.println("The number of primes between 10 and 30 is: " +
        // result.primeCount(10, 30));

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
