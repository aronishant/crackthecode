package Recursion;

public class CheckIfArraySorted {
    public static boolean check(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return check(arr, idx + 1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 3, 5,7,7}, 0));
    }
}
