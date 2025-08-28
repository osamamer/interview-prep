package SlidingWindow;

public class MaxConsOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int length, maxLength = 0, zeroesAllowed = k;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroesAllowed--;
            }
            while (zeroesAllowed < 0) { // An invalid window is not tolerated. If you do an If statement, the right will get far ahead of the left. You have to wait till the left is clear.
                if (nums[left] == 0)
                    zeroesAllowed++;
                left++;
            }
            length = right - left + 1; // Guaranteed to be a valid window. Always use right - left + 1 instead of incrementing and decrementing length.
            maxLength = Math.max(maxLength, length);
            right++; // right is always incremented because we only get here once the window is valid.
        }
        return maxLength;
    }
}
