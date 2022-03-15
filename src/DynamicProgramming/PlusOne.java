/*https://leetcode.com/problems/plus-one/*/
package DynamicProgramming;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                break;
            } else {
                nums[i] = 0;
            }
        }
        if (nums[0] == 0) {
            int[] newNums = new int[nums.length + 1];
            newNums[0] = 1;
            return newNums;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9})));
    }

}
