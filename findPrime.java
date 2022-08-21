/*
 * This program determines if a number is prime
 */
public class findPrime {
    public static void main(String[] args) {

        int number = 23;

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
