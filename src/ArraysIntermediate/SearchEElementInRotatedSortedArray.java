package ArraysIntermediate;

public class SearchEElementInRotatedSortedArray {

    public static int search(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            //Left part is sorted
            if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = high - 1;
                } else {
                    low = low + 1;
                }

            }
            // Right part is sorted
            else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = low + 1;
                } else {
                    high = high - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,1}, 1));
    }
}

//key=3
// mid=4.. [9]
