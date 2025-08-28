package SlidingWindow;

public class MaxAvgSubarray {
    public static void main(String[] args) {
        int [] nums = {-1};
        System.out.println(findMaxAverage(nums, 1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int left = 0, right = 0;
        double maxAverage = -Double.MAX_VALUE;
        double sum = 0;
        double average = 0;
        while (right < nums.length) {
            sum += nums[right];
            if (right - left + 1 == k) {
                average = sum / k;
                maxAverage = Math.max(maxAverage, average);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return maxAverage;
    }
}
