package Sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
   }

    public static void main(String[] args) {
        sort(new int[]{3, 6, 9, 7, 4, 1});
    }
}
