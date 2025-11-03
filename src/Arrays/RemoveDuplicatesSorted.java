package Arrays;

import java.util.HashSet;

public class RemoveDuplicatesSorted {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0, r = 0;
        int k = 0;
        while (r < nums.length) {
            if (!set.contains(nums[r])) {
                k++;
                set.add(nums[r]);
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return k;
    }
}
