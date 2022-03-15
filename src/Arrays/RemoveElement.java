/*https://leetcode.com/problems/remove-element/*/

package Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 2, 3, 4, 5}, 2));
    }
}
