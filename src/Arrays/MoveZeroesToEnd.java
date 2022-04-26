package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void moveZeroesToEnd(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[counter++] = arr[i];
            }
        }
        while (counter < arr.length) {
            arr[counter++] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        moveZeroesToEnd(new int[]{1, 0, 3, 0, 1, 1});
    }
}
