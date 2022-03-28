package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArraysTwoPointer {
    public static int[] merge(int[]a,int[]b,int m,int n){
        int i = m - 1 , j = n - 1 , idx = m + n - 1;
        while(i >= 0 && j >= 0)
        {
            if(a[i] >= b[j])
            {
                a[idx] = a[i];
                i--;
            }
            else
            {
                a[idx] = b[j];
                j--;
            }
            idx--;
        }
        while(i >= 0)
            a[idx--] = a[i--];
        while(j >= 0)
            a[idx--] = b[j--];

        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 3, 5, 0, 0, 0}, new int[]{2, 4, 9}, 3, 3)));
        System.out.println(Arrays.toString(merge(new int[]{1}, new int[]{}, 1, 0)));
        System.out.println(Arrays.toString(merge(new int[]{0}, new int[]{1}, 0, 1)));
    }
}
