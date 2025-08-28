package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int [] twoIndices = new int[] {};
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (!hashMap.containsKey(remainder)) {
                hashMap.put(remainder, i);
            }
            if (hashMap.containsKey(nums[i]) && i != hashMap.get(nums[i])) {
                twoIndices = new int[]{hashMap.get(nums[i]), i};
                break;
            }
        }
        return twoIndices;
    }
    public static void Main(String[] args) {
        int [] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
