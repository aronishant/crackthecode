/*https://leetcode.com/problems/search-insert-position/*/

package Arrays;

public class SearchInsertPositionLinearSearch {
    public static int returnIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.println(returnIndex(new int[]{1, 3, 5}, 7));
    }
}

//O(n)