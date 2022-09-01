
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
        System.out.println("Check if array is n-unique: " + isNUnique(myArray, 11));

    }

    public static int isNUnique(int[] a, int n) {
        // check for the edge case
        if (a.length < 2) {
            return 0;
        }
        int pairCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (pairCount > 1) {
                return 0;

            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    pairCount += 1;
                }

            }
        }

        return 1;

    }

}
