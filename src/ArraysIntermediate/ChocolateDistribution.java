package ArraysIntermediate;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void cal(int[] arr, int m) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - m; i++) {
            int min = arr[i];
            int max = arr[i + m - 1];
            int diff = max - min;
            if (diff < ans) {
                ans = diff;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        cal(new int[]{3,4,1,9,56,7,9,12}, 5);
    }
}
