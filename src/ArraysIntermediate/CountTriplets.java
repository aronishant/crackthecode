package ArraysIntermediate;

import java.util.Arrays;

public class CountTriplets {
    public static int count(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = arr.length - 1; i >= 2; i--) {
            int low = 0;
            int high = i - 1;
            while (low < high) {
                if (arr[low] + arr[high] == arr[i]) {
                    count++;
                    low++;
                    high--;
                } else if (arr[low] + arr[high] < arr[i]) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 5, 3, 2, 8, 10}));
    }
}

//1,2,3,5,8,10