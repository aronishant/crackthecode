package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachElementUsingHashMap {

    public static void countOccurance(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            } else {
                hmap.put(arr[i], 1);
            }
        }
        for (Map.Entry mentry : hmap.entrySet()) {
            System.out.println("Number is " + mentry.getKey() + " and its frequency is " + mentry.getValue());
        }
    }

    public static void main(String[] args) {
        countOccurance(new int[]{1, 2, 3,1});
    }
}
