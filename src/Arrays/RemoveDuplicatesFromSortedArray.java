/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Return count of the updated array after removing the duplicate elements
*/

package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int [] nums){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[count]=nums[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
