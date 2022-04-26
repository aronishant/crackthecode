package ArraysIntermediate;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int getKthSmallestElement(int[] arr, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int element : arr) {
            maxHeap.add(element);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }

    public static void main(String[] args) {
        System.out.println(getKthSmallestElement(new int[]{7, 3, 1, 5}, 2));
    }
}
