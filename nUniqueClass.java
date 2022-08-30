
// . An array is defined to be n-unique if exactly one pair of its elements sum to n. For example, the array {2, 7, 3, 4} is 5-
// unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not 5-unique because a[0] + a[1] = 5 and a[0] +
// a[2] = 5.
// Write a function named isNUnique that returns 1 if its integer array argument is n-unique, otherwise it returns 0. So
// isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and
// isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.
// If you are programming in Java or C#, the function signature is
// int isNUnique(int[ ] a, int n)

// My approach
// 

public class nUniqueClass {
    public static void main(String args[]) {

        int[] myArray = { 7, 3, 3, 2, 4 };
        System.out.println("Check if array is n-unique: " + isNUnique(myArray, 6));

    }

    public static int isNUnique(int[] a, int n) {
        // check for the edge case
        if (a.length < 2) {
            return 0;
        }

        int left = 0;
        int right = a.length - 1;
        int numberOfSumPairs = 0;
        while (left < right) {

            System.out.println(a[left] + a[right]);

            if (a[left] + a[right] == n) {
                System.out.println("The navalue of n:" + n);
                System.out.println("Target achieved at index: " + left + "and " + right);
                numberOfSumPairs += 1;
            }

            if (a[left] + a[right] < n) {
                left++;
            } else {
                right--;
            }

            if (numberOfSumPairs > 1) {
                return 0;
            }
        }

        return 1;

    }

}
