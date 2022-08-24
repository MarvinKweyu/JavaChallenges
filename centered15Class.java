import java.util.Arrays;

public class centered15Class {
    public static void main(String args[]) {
        int[] myArray = { 2, 10, 4, 1, 6, 9 };
        System.out.println("the array is centered: " + isCentered15(myArray));

    }

    public static int isCentered15(int[] a) {
        int arrayLength = a.length;
        int left = 0;
        int right = arrayLength - 1;
        int isCentered = 0;

        while (left < right) {
            int[] newArray = Arrays.copyOfRange(a, left, right);
            int sum = 0;
            for (int num : newArray) {
                sum += num;
            }
            System.out.println("Sum is" + sum);
            if (sum == 15) {
                isCentered = 1;
                return 1;
            }
            if (sum < 15) {

                left++;
            } else {

                right--;
            }

        }
        return isCentered;
    }
}
