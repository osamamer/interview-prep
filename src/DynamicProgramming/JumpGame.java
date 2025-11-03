package DynamicProgramming;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) { // FIRST TRY BABYYYYYYY!!!!!
        if (nums.length == 1) return true;
        boolean[] possible = new boolean[nums.length];
        possible[possible.length - 1] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            int jump = 1;
            while (jump <= nums[i] && i + jump < nums.length) {
                if (possible[i + jump]) {
                    possible[i] = true;
                    break;
                }
                jump++;
            }
        }
        return possible[0];
    }
}
