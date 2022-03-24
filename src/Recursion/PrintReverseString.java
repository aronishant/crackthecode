package Recursion;

public class PrintReverseString {
    public static void print(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        print(str, idx - 1);
    }
    public static void main(String[] args) {
        String str = "nishant";
        print(str, str.length() - 1);
    }
}
//O(n)