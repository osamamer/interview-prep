package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> sets = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, new ArrayList<>(), 0);
        return sets;
    }
    public void backtrack(int[] nums, List<Integer> current, int start) {
        sets.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, current, i + 1);
            current.remove(current.size() - 1); // REMOVE THE LAST ONE NOT NUMS[I]!!!!
        }
    }
}
