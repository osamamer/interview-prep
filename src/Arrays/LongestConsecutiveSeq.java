package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int length;
        int maxLength = 0;
        for (int num : hashSet) { // YOU MUST ITERATE OVER THE SET NOT THE ARRAY!!!! THE ARRAY CONTAINS DUPLICATES SO WE'D BEEN LOOKING FOR THE SAME SEQUENCE AGAIN AND AGAIN!
            if (!hashSet.contains(num - 1)) { // And to iterate over all items in a set you just have to use an enhanced for loop
                length = 1;
                int j = 1;
                while (hashSet.contains(num + j)) {
                    j++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
