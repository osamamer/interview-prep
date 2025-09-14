package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] dp = Arrays.copyOf(nums, nums.length + 1);
        for (int i = dp.length - 3; i >= 0; i--) {
            dp[i] = Math.max(dp[i] + dp[i + 2], dp[i + 1]);
        }
        return Math.max(dp[0], dp[1]);
    }
}
