package DynamicProgramming;

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] greatestProduct = new int[nums.length];
        int[] leastProduct = new int[nums.length];
        int maxProd = nums[nums.length - 1];
        greatestProduct[greatestProduct.length - 1] = nums[nums.length - 1];
        leastProduct[leastProduct.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            greatestProduct[i] = Math.max(nums[i], Math.max(nums[i] * greatestProduct[i+1], nums[i] * leastProduct[i+1]));
            leastProduct[i] = Math.min(nums[i], Math.min(nums[i] * greatestProduct[i+1], nums[i] * leastProduct[i+1]));

            maxProd = Math.max(greatestProduct[i], maxProd);
            maxProd = Math.max(maxProd, leastProduct[i]);
        }
        return maxProd;
    }
}
