package DynamicProgramming;

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int greatestProduct = nums[0];
        int leastProduct = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = greatestProduct;
            greatestProduct = Math.max(nums[i], greatestProduct * nums[i]);
            greatestProduct = Math.max(greatestProduct, leastProduct * nums[i]);
            leastProduct = Math.min(nums[i], leastProduct * nums[i]);
            leastProduct = Math.min(leastProduct, tempMax * nums[i]);

            max = Math.max(greatestProduct, max);

        }
        return max;
    }
}
