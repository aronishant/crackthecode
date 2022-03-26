package Recursion;

public class MoveAllXtoEndInString {

    public static void moveX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            moveX(str, idx + 1, count, newString);
        } else {
            newString += currentChar;
            moveX(str, idx + 1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axxbxcd";
        moveX(str, 0, 0, "");
    }
}


//axxbxcd