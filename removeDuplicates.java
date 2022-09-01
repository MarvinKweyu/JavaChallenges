public class removeDuplicates {
    public static void main(String args[]) {
        int[] myArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("Result is: " + removeOccurence(myArray));

    }

    /*
     * Returns the number of items in the array that are not equal
     */
    public static int removeOccurence(int[] nums) {
        // edge case check
        if (nums.length < 1) {
            return 0;
        }
        int index = 1;
        // because it is sorted in ascending order, the last item is compared with the
        // nums[i + 1] hence here we loop from i == 0 to i == nums.length - 1
        // to prevent an overflow to a null item more than what the array holds
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("Character: " + nums[i]);
            // first case is when a[i] == 0 and nums[i + 1] == 1. i at this point is 1
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;

    }
}
