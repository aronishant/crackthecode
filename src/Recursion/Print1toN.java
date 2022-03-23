package Recursion;

public class Print1toN {

    public static void print(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n);
        print(n + 1);
    }

    public static void main(String[] args) {
        int x = 1;
        print(x);
    }
}
