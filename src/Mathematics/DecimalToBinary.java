package Mathematics;

import java.util.Arrays;

public class DecimalToBinary {
    public static void convertDecToBinary(int n) {
        int[] binary = new int[100];
        int number, index = 0;
        while (n > 0) {
            number = n % 2;
            binary[index] = number;
            n = n / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        convertDecToBinary(0);
    }
}
