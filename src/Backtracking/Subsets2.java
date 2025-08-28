package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 { // WHEN YOU HAVE DUPLICATES IN BACKTRACKING, YOU SORT!!!!!!
    // So that you can have all duplicates next to each other and compare adjacent elements.
    List<List<Integer>> sets = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return sets;
    }
    public void backtrack(int[] nums, int start, List<Integer> current) {
        sets.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) { // This and sorting are the only differences to Subsets I.
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
