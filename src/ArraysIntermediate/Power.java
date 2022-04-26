package ArraysIntermediate;

import java.util.Arrays;

public class Power {

    public static void calpow(int[] arr) {
        int base, power, index = 0, product = 1;
        int[] prodlist = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            base = arr[i];
            power = arr[i + 1];
            while (power != 0) {
                product *= base;
                power--;
            }
            prodlist[i] = product;
            product = 1;
        }
        System.out.println(Arrays.toString(prodlist));

        int max = prodlist[0];
        for (int i = 1; i < prodlist.length - 1; i++) {
            if (prodlist[i] > max) {
                max = prodlist[i];
                index = i;
            }
        }
        System.out.println(index);

    }

    public static void main(String[] args) {
        calpow(new int[]{2, 10, 3, 7});
    }
}
