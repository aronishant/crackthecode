package Arrays;

public class MinMaxInArray {

    public static void minmax(int[] nums) {
        int min, max;
        if (nums == null || nums.length < 1) {
            System.out.println("Enter proper array");
        }

        if (nums.length == 1) {
            min = nums[0];
            max = nums[0];
        }

        if (nums[0] > nums[1]) {
            max = nums[0];
            min = nums[1];
        } else {
            max = nums[1];
            min = nums[0];
        }

        for (int i = 2; i <=nums.length - 2; ) {
            if (nums[i] > nums[i + 1]) {
                max=Math.max(max,nums[i]);
                min =Math.min(min,nums[i + 1]);
            } else {
                max = Math.max(max,nums[i + 1]);
                min = Math.min(min,nums[i]);
            }

            i = i + 2;
        }

        if (nums.length%2==1)
        {
            max=Math.max(max,nums[nums.length-1]);
            min=Math.min(min,nums[nums.length-1]);
        }

        System.out.println(min +" "+max);
    }

    public static void main(String[] args) {
        minmax(new int[]{1,2,3,4,5,6,7});
    }
}



