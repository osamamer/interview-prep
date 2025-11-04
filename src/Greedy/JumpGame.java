package Greedy;

public class JumpGame {
    public boolean canJump(int[] nums) { // FIRST TRY BABYYYYYY!!!!
        if (nums.length == 1) return true;
        int maxIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxIndex = Math.max(i + nums[i], maxIndex);
            if (maxIndex == i) return false; // If the furthest I can reach is the index I'm at, it's so over.
            if (maxIndex >= nums.length - 1) { // If I can already make it, you can break free of the loop.
                return true;
            }
        }
        return false;
    }
}
