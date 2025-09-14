package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) { // check every coin for every amount
                if (coin <= i) { // i is the amount we want to see how many coins it takes to make; if the coin is greater than that amount, we don't consider it
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]); // dp[i] = minimum amount of coins required to get an amount of i
                } // coin <= i NOT coin <= amount; dp[i - coin] NOT dp[amount - coin]. The amount should not be involved here. You are doing this for every value
                // between 1 and amount.
            }
        }
        return dp[amount] > amount ? -1 : dp[amount]; // Because they're initialized to amount + 1. If that doesn't change, there is no answer, return -1.
    }
    // Example: coins are {1,3,4,5}, amount = 7
    // Get dp[7] --> go through every coin.
    // 1: 7 - 1 = 6 >= 0 --> dp[7] = 1 + dp[6]
    // 3: 7 - 3 = 4 >= 0 --> dp[7] = min(previous, 1 + dp[4])
    // 4: 7 - 4 = 3 >= 0 --> dp[7] = min(previous, 1 + dp[3])
    // 5: 7 - 5 = 2 >= 0 --> dp[7] = min(previous, 1 + dp[5])
    // If i == coin --> 1 + dp[0] = 1

}
