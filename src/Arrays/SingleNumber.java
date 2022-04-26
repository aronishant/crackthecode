package Arrays;

import java.util.Arrays;

public class SingleNumber {

    public static int find(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = find(new int[]{3, 2, 3,2,1});
        System.out.println(n);

    }
}
