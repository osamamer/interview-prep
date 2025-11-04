package Greedy;

public class MaxSubarray {
    public int maxSubArray(int[] nums) { // BASICALLY FIRST TRY BABYYYYY!!!
        int sum = 0;
        int maxSum = -Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // At each step, pick the choice that seems best right now, hoping it leads to the global optimum. Either continue the subarray or reset from this element.
            if (sum < 0 && nums[i] >= sum) { // I had nums[i] >= 0 before but even if it's negative but greater than the previous sum we should reset the sum to it.
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
