/*https://leetcode.com/problems/merge-sorted-array*/

package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] merge(int[] nums1, int[] nums2, int m, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 3, 5, 0, 0, 0}, new int[]{4, 2, 9}, 3, 3)));
    }
}

   /* Time Complexity
    O(KlogK), where K = N + M. N = size of the first array, M = size of the second array.
    As we sort the first array after it has stored all N + M elements.*/
