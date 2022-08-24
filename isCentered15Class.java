import java.util.Arrays;

// An array is called centered-15 if some consecutive sequence of elements of the array sum to 15 and 
// this sequence is preceded and followed by the same number of elements. 
// For example {3, 2, 10, 4, 1, 6, 9} is centered-15 because the sequence 10, 4, 1 sums to 15 and the sequence 
// is preceded by two elements (3, 2) and followed by two elements(6,9).

// Write a method called isCentered15 that returns 1 if its array argument is centered-15, otherwise it returns 0.

public class isCentered15Class {
    public static void main(String args[]) {
        int[] myArray = { 2, 10, 4, 1, 6, 9 };
        System.out.println("item is centered: " + isCentered15(myArray));

    }

    public static int isCentered15(int[] a) {
        // logic
        // start from the right and remove an item and do the same to the left
        // if any sum of the remainder is 15, return 1
        int result = 0;
        int count = 2; // start with removing two items. One from each side
        int[] newArray = a;

        for (int i = 0; i < newArray.length; i++) {

            int itemsRemovedOnLeft = count / 2;
            int itemsRemovedOnRight = count / 2;

            // newArray[i]
            // {1,2,3,4};

            int sum = 0;

            int[] slicedArray = Arrays.copyOfRange(newArray, itemsRemovedOnLeft - 1,
                    newArray.length - itemsRemovedOnRight);
            count += 2;
            int itemIndex = 0;

            for (int j = 0; j < slicedArray.length; j++) {
                System.out.println("Sum: " + sum);
                System.out.println("Number: " + slicedArray[j]);
                sum = sum + slicedArray[i];
                if (sum > 15) {
                    sum = 0;

                }
                if (sum == 15) {
                    return 1;

                }

            }
        }

        return result;

    }
}
