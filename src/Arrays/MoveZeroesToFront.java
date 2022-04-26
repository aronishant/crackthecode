package Arrays;

import java.util.Arrays;

public class MoveZeroesToFront {
    public static void moveZeroes(int[] arr) {
        int current = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[current] = arr[i];
                current--;
            }
        }
        while (current >= 0) {
            arr[current] = 0;
            current--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1, 0, 2, 0, 0, 0});
    }
}
