package Recursion;

public class TowerOfHanoi {
    public static void transferOfHanoi(int n, String src, String helper,String dest ){
        if (n==1){
            System.out.println("Transfer disk "+ n + " from " + src +" to " + dest);
            return;
        }
        transferOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk"+ n + " from " + src +" to " + dest);
        transferOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        transferOfHanoi(3,"S","H","D");
    }
}

//O(2^n)