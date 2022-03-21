package Mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static boolean[] countPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        boolean[] isPrimecheck = countPrimeNumbers(20);
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + "--" + isPrimecheck[i]+"," +"");
        }
    }
}

//0 1 2 3 4 5 6 7 8 9
//F F T T F T T T T T
