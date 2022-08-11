// ! This is  not part of the questions allocated. This is a wild card program from leetcode

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

//* */ Source: // https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    // no idea what I was doing here. I will fix this
    // Todo: fix this strange method
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

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberIndexes = new HashMap<Integer, Integer>();
        int[] numbersSumming = new int[2];

        for (int i = 0; i < nums.length; i++) {
            Integer number2 = (Integer) (target - nums[i]);
            if (numberIndexes.containsKey(number2)) {
                numbersSumming[0] = numberIndexes.get(number2);
                numbersSumming[1] = i;
                return numbersSumming;

            }
            // add num1 and its location on the array
            numberIndexes.put(nums[i], i);
        }
        return numbersSumming;
    }
}

public class twoSum {
    public static void main(String[] args) {

        Solution answer = new Solution();
        int[] myArray = { 1, 1, 2 };

        // int result = answer.removeDuplicates(myArray);

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        // expected output
        // Output: [0,1]

        System.out.println(answer.twoSum(nums, target)[0]);
        System.out.println(answer.twoSum(nums, target)[1]);

        // nums = [3,2,4], target = 6

        // int[] nums = { 3, 2, 4 };
        // int target = 6;
        // output result [1,2]
    }

}
