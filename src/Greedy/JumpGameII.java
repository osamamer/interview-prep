package Greedy;

public class JumpGameII { // I had the right idea but couldn't fully implement it correctly.
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int jumps = 0;
        int maxJump = 0;
        int maxJumpIndex = 0;
        for (int i = 0; i < nums.length;) { // MAKE A DECISION EVERY TIME TO GO TO ONE AND STICK WITH THAT DECISION. GREEDY.
            // THE BEST DECISION IS ALWAYS TO GO TO THE STEP THAT HAS THE HIGHEST JUMP (IF THERE'S A DUPLICATE GO TO THE LATER ONE)
            if (i + nums[i] >= nums.length - 1) {
                jumps++;
                break;
            }

            int bestIndex = i;
            int maxReach = i + nums[i];
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) { // LOOP THROUGH THE CURRENT POSSIBLE OPTIONS GIVEN THE CURRENT JUMP
                if (j + nums[j] > maxReach) { // BIG MISTAKE: YOU WERE USING THE SAME VARIABLE TO LOOP AND TO UPDATE. THE GROUND BENEATH YOU WAS CHANGING. JUST MAKE SURE THE BOUNDARY OF
                    // THE LOOP NEVER CHANGES WITHIN THE LOOP!
                    maxReach = j + nums[j];
                    bestIndex = j;
                }
            }
            jumps++;
            i = bestIndex;
        }
        return jumps;
    }
}
