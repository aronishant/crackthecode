package Numbers;

public class Palindrome {
    public static boolean palindrome(int num) {
        int sum=0,r;
        int temp=num;
        while(num>0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        if (palindrome(121)) {
            System.out.println("The entered number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
