package ArraysIntermediate;

public class SearchInsertPositionBinarySearch {

    public static int searchElement(int nums[], int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == key) {
                return mid;
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(searchElement(new int[]{-1, 0, 2, 5, 6}, 1));
    }
}
//O (log)2 N