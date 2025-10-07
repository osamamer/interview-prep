package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class PartitionEqualSubsets {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        // If total sum is odd, can't split into two equal subsets
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: sum 0 is always achievable

        for (int num : nums) {
            // iterate backwards to avoid using same num twice
            for (int s = target; s >= num; s--) {
                dp[s] = dp[s] || dp[s - num];
                // To make sum s with this number, either we already had sum s, or we had sum s - num and we add this number to it.
                if (dp[target]) return true;
            }
        }
        return dp[target];
    }
}
