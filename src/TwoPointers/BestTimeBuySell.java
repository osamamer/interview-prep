package TwoPointers;

public class BestTimeBuySell {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        int profit = 0;
        if (prices.length == 1)
            return 0;
        for (int left = 0, right = 1; right < prices.length; right++) {
            profit = prices[right] - prices[left];
            maxProfit = Math.max(profit, maxProfit);
            if (prices[right] < min) {
                min = prices[right];
                left = right;
            }
        }
        return maxProfit;
    }
}
