package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> sets = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return sets;
    }
    public void backtrack(int [] nums, int start, List<Integer> current) {
        sets.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current); // i + 1 NOT start + 1!!!
            current.removeLast();
        }
    }
}
