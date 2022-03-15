package Numbers;

public class MissingNumber {

    public static int missingNumber(int[] nums)
    {
        int size=nums.length;
        int sum=size*(size+1)/2;
        for (int i=0;i<nums.length;i++)
        {
            sum=sum-nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
