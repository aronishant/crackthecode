package ArraysIntermediate;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

    private static int getKthLargestUsingMinHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.remove();
        }
        return minHeap.remove();
    }

    private static int getKthLargestUsingBruteForce(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        System.out.println(getKthLargestUsingMinHeap(new int[]{7, 3, 1, 5}, 3));
    }
}
