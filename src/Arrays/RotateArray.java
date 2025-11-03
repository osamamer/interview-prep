package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] oldnums = Arrays.copyOf(nums, nums.length);
        int n = oldnums.length;
        for (int i = n - 1; i >= 0; i--) {
            int index = i + k;
            nums[index % n] = oldnums[i];
        }
    }
}
