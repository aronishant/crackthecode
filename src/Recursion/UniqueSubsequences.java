package Recursion;

import java.util.HashSet;

public class UniqueSubsequences {
    public static void uniqueSequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(idx);
        uniqueSequence(str, idx + 1, newString + currentChar, set);
        uniqueSequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSequence(str, 0, "", set);
    }
}
