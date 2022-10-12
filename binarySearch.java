public class binarySearch {
    public static void main(String args[]) {

    }

    int search(int[] a, int target) {

        int arrayLength = a.length;
        int left = 0;
        int right = arrayLength - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (a[middle] == target) {
                return middle;
            }

            if (target < a[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return -1;
    }
}

O(n), O(1), O(n2)
