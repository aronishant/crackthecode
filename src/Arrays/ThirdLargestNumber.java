package Arrays;

public class ThirdLargestNumber {

    static int search(int[] arr) {
        int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 21, 69, 5, 645, 10, 22, 8, 290}));
    }
}
