package Recursion;

public class StringSubSequences {

    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currentChar);
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
