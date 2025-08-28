package TwoPointers;

import java.util.Arrays;

public class MaxKSumPairs {
    public int maxOperations(int[] nums, int k) { // FIRST TRY
        if (nums.length == 1)
            return 0;
        int left = 0, right = nums.length - 1, pairs = 0;
        Arrays.sort(nums);
        while (left < right) {
            if (nums[left] + nums[right] > k) {
                right--;
            }
            else if (nums[left] + nums[right] < k) {
                left++;
            }
            else {
                pairs++;
                left++;
                right--;
            }
        }
        return pairs;
    }
}
