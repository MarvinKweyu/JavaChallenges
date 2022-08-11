
/*
 * 2. Define n-upcount of an array to be the number of times the partial sum goes from less than or equal to n to greater than n during the calculation of the elemends
 * of the array
 */
class partialSum {
    int nUpCount(int[] a, int n) {
        int partialSum = 0;
        int sum = 0;
        for (int num : a) {
            sum = sum + num;

            if (sum > n) {
                partialSum += 1;
            }
        }
        return partialSum;
    }
}

public class counter {
    public static void main(String[] args) {
        partialSum value = new partialSum();

        // test cases
        int n = 5;
        int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 }; // result is 3

        int n2 = 20;
        int[] a2 = { 1, 2, -1, 5, 3, 2, -3 }; // result is 0

        // ! fix: this fails
        int n3 = 6;
        int[] a3 = { 6, 3, 1 }; // result is 1

        System.out.println("\nThe partial sum is: " + (value.nUpCount(a, 5) == 3));
        System.out.println("The partial sum is: " + (value.nUpCount(a2, n2) == 0));
        System.out.println(value.nUpCount(a3, 6));
        System.out.println("The partial sum is: " + (value.nUpCount(a3, 6) == 1));

    }
}
