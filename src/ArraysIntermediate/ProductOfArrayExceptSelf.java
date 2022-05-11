package ArraysIntermediate;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    static int[] product(int[] arr) {
        int[] prod = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int p = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                    continue;
                }
                p = p * arr[j];
            }
            prod[i] = p;

        }
        return prod;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(product((new int[]{1, 2, 3, 4}))));
    }
}
