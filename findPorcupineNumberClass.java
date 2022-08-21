
// Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is
// greater than n. So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would
// findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the second porcupine number.

public class findPorcupineNumberClass {

    public static void main(String args[]) {
        System.out.println("the first porcupine number found is: " + findPorcupineNumber(0));

    }

    public static int findPorcupineNumber(int n) {

        int result = n;

        // find the next prime number greater than this and check if it ends with 9
        boolean foundPrime = false;

        while (!foundPrime) {
            result++;
            // check if the next prime number found ends with 9
            if (isPrime(result) && result % 10 == 9 && nextPrimeNumberIsEndsWith9(result)) {
                foundPrime = true;

                return result;

            }
        }

        return result;

    }

    public static boolean nextPrimeNumberIsEndsWith9(int number) {

        boolean ends9 = false;
        int result = number;
        boolean foundPrime = false;

        while (!foundPrime) {
            result++;

            // check if the next prime number found ends with 9
            if (isPrime(result)) {

                foundPrime = true;

            }
        }

        if (foundPrime && result % 10 == 9) {
            return true;
        }

        return ends9;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
