package Recursion;

public class XToThePowerN {
    public static int calpower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * calpower(x, n - 1);
    }
    public static void main(String[] args) {
        int res = calpower(2, 6);
        System.out.println(res);
    }
}
//O(n)