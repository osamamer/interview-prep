package BinarySearch;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int [] nums = {2, 1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int min = nums[0];
        while (start <= end) {
            if (nums[start] < nums[end]) { // Now you're in a fully sorted portion, there's no point in continuing. Just check if the leftmost num is less than the current min.
                min = Math.min(min, nums[start]);
            }
            int middle = (start + end) / 2;
            min = Math.min(min, nums[middle]);

            if (nums[middle] >= nums[start]) // That means the middle value is a part of the left sorted portion, which is all greater than the right sorted portion since it's rotated.
                start = middle + 1;
            else
                end = middle - 1;
        }
        return min;
    }
}
