package Recursion;

public class SumOfNNaturalNumbers {

    public static int calsum(int n)
    {
        if (n==1)
            return n;
        return n+calsum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calsum(6));
    }
}

