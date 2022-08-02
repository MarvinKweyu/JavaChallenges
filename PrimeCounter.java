class Counter {
    int primeCount(int start, int end) {
        int numberOfPrimes = 0;
        for (int i = start; i < end / 2; ++i) {
            if (end % i != 0) {
                System.out.println("value is: " + i);
                numberOfPrimes += 1;
            }

        }
        return numberOfPrimes;

    }
}

public class PrimeCounter {
    public static void main(String[] args) {
        Counter result = new Counter();

        System.out.println("The number of primes between 10 and 30 is: " + result.primeCount(10, 30));
    }
}
