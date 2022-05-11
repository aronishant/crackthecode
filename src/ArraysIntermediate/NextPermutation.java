package ArraysIntermediate;

import java.util.Arrays;

public class NextPermutation {
    private static void findNextPermutation(int[] arr) {
        int deflection = arr.length - 1;

        /*Traverse the array from end and validate till all the elements are arranged in increasing order.
        Index at which smaller element is found from the last one, mark the deflection.*/
        while (deflection >= 1 && arr[deflection - 1] >= arr[deflection]) {
            deflection--;
        }
        //Just sort the array if no deflection found
        if (deflection == 0) {
            Arrays.sort(arr);
            System.out.print(Arrays.toString((arr)));
            return;
        }
        deflection--;

        //Find the next greater element than the deflection
        int second = arr.length - 1;
        while (deflection < second && arr[deflection] >= arr[second]) {
            second--;
        }

        //Swap the above two elements
        swap(arr, deflection, second);

        //Reverse the remaining part of the array.
        int start = deflection + 1;
        int end = arr.length - 1;
        reverseArray(arr, start, end);

        //Print the output array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        findNextPermutation(new int[]{3,2,1});
    }
}

