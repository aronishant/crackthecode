package ArraysIntermediate;

//https://leetcode.com/problems/3sum/

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();
        if (arr.length == 0) return new ArrayList<>(res);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;

            while (low < high) {
                int sum = arr[low] + arr[high];
                if (sum == -arr[i]) {
                    res.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    low++;
                    high--;
                } else if (sum < -arr[i]) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


}
