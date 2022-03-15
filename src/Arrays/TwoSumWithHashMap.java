/*https://leetcode.com/problems/two-sum/*/


package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumWithHashMap {
    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hmap.containsKey(complement)) {
                return new int[]{hmap.get(complement), i};
            } else {
                hmap.put(nums[i], i);
            }
        }
      return new int[]{};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSums(new int[]{1,4,5},5)));
    }
}
// Time complexity