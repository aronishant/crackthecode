package ArraysIntermediate;

public class MajorityElement {

    public static int calMajorityElement(int[] arr) {
        int count=0;
        int candidate=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==arr[i+1]){
                count++;
            }
            else {
                count--;
            }
        }



        return -1;
    }
    public static void main(String[] args) {
        int n = calMajorityElement(new int[]{8,8,7,7,7});
        System.out.println(n);
    }
}
