package DynamicProgramming;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) { // FIRST TRY BABYYYYYY!!!!!!!!!!!!!!!
        if (nums.length == 1)
            return 1;
        int[] dp = new int[nums.length];
        dp[dp.length - 1] = 1;
        int maxLen = 1;
        for (int i = dp.length - 2; i >= 0; i--) {
            dp[i] = 1;
            int localMax = 0;
            for (int j = i + 1; j < dp.length; j++) {
                if (nums[j] > nums[i] && dp[j] > localMax) { // BE CAREFUL WHAT ARRAY'S VALUES YOU'RE ACTUALLY COMPARING!!!!
                    localMax = dp[j];
                    dp[i] = dp[j] + 1;
                    if (dp[i] > maxLen) {
                        maxLen = dp[i];
                    }
                }
            }
        }
        return maxLen;
    }
}
