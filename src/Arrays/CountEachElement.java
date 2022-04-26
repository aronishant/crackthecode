package Arrays;


import java.util.Arrays;

public class CountEachElement {
    public static void count(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Number is " + arr[i] + " and frequency is " + count);
        }
    }

    public static void main(String[] args) {
        count(new int[]{1, 2, 3, 1});
    }


}

