package Recursion;

public class XtoThePowerNWithLessStackCalls {
    public static int calpower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return calpower(x, n / 2) * calpower(x, n / 2);
        } else {
            return calpower(x, n / 2) * calpower(x, n / 2) * x;
        }
    }
    public static void main(String[] args) {
        int res = calpower(2, 5);
        System.out.println(res);
    }
}


//O(logn)