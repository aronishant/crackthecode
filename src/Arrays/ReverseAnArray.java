package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main (String args[])
    {
        int[]nums= new int[]{1,2,3,4};
        int i = 0,j=nums.length-1;
        int temp;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(nums));
    }
}


// 1,2,3,4

