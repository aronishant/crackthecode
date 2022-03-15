/*https://leetcode.com/problems/two-sum/*/

package Arrays;

import java.util.Arrays;

public class TwoSum2PointerApproach {

    public static int[] twoSums(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int tempSum = nums[left] + nums[right];
            if (tempSum == target) {
                return new int[]{left, right};
            }
            if (tempSum > target) {
                right--;
            } else left++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSums(new int[]{1, 4, 5}, 9)));
    }
}


