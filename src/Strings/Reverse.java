package Strings;

public class Reverse {

    static void reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        System.out.println(chars);
    }

    static void printReverse(String str){
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        reverse("Nishant");
        printReverse("Nishant");
    }
}
