package BinarySearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target)
                return middle;
            if (nums[left] <= nums[middle]) { // We're in the left sorted portion
                if (target > nums[middle] || target < nums[left]) {
                    // If the target is greater than the middle, then it must be to the right as you're in a sorted portion.
                    // If the target is less than the left number, then it must be in the right portion which is to the right.
                    left = middle + 1;
                }
                else {
                    right = middle - 1;
                }
            }
            else { // We're in the right sorted portion
                 if (target < nums[middle] || target > nums[right]) {
                     // If the target is less the middle, it must be to the left as all to the right are greater since
                     // we're in right sorted portion.
                     // If target is greater than right, then it's greater than the whole right portion so it's in the left portion.
                     // Either way, go left.
                    right = middle - 1;
                }
                else { // Any other case, go right.
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}
