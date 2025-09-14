package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(
                rob1(Arrays.copyOfRange(nums, 1, nums.length)),     // exclude first
                rob1(Arrays.copyOfRange(nums, 0, nums.length - 1))  // exclude last
        );
    }

    public int rob1(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = Arrays.copyOf(nums, nums.length + 1);
        for (int i = dp.length - 3; i >= 0; i--) {
            dp[i] = Math.max(dp[i] + dp[i + 2], dp[i + 1]);
        }
        return Math.max(dp[0], dp[1]);
    }
}
