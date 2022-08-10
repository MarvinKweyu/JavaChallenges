import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i += 1] = 1000;
            }
        }
        Arrays.sort(nums);
        int length = 0;
        for (int number : nums) {
            if (number != 1000) {
                length += 1;
            }
        }
        return length;

    }
}

public class twoSum {
    public static void main(String[] args) {

        Solution answer = new Solution();
        int[] myArray = { 1, 1, 2 };

        // int result = answer.removeDuplicates(myArray);

        // System.out.println("The result is: " + result);
        int myNumber = 0;
        System.out.println("Updated number: " + ++myNumber);

        System.out.println("Updated number after: " + myNumber++);
    }

}
