package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> perms = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used);
        return perms;
    }
    public void backtrack(int[] nums, List<Integer> current, boolean[] used) {
        if (current.size() == nums.length) {
            perms.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) { // This is Depth First Search.
            // i must begin at 0 not start because we want to go through every element.
            // If it's used in the call's scope, we don't take it.
            if (used[i])
                continue;
            current.add(nums[i]);
            used[i] = true;
            backtrack(nums, current, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
