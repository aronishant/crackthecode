package ArraysIntermediate;

public class StockBuySell1 {

    public static int calculateProfit(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < buyPrice) {
                buyPrice = arr[i];
            } else if (arr[i] > buyPrice) {
                profit = arr[i] - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(calculateProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
