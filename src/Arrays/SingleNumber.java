package Arrays;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> appearsOnce = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                appearsOnce.add(nums[i]);
            }
            else {
                appearsOnce.remove(nums[i]);
            }
        }
        return (int) appearsOnce.toArray()[0];
    }
}
