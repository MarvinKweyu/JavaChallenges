public class sumFactorCheck {
    public static void main(String args[]) {
        int[] myArray = { 0, 0, 0 };

        System.out.println("The sum factor of the array is: " + sumFactor(myArray));
    }

    public static int sumFactor(int a[]) {
        int sumCount = 0;
        int sum = 0;

        // sum factor of emty array is 0
        if (a.length == 0) {
            return 0;
        }

        for (int num : a) {
            sum += num;
        }

        for (int num : a) {
            if (sum == num) {
                sumCount += 1;
            }
        }

        return sumCount;
    }
}