package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    List<List<Integer>> combs = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), 0);
        return combs;
    }
    public void backtrack(int[] candidates, int target, int start, List<Integer> current, int sum) {
        if (sum == target) {
            combs.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum > target) {
                return;
            }
            current.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, i + 1, current, sum);
            current.remove(current.size() - 1); // NOT CANDIDATES[I]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            sum -= candidates[i]; // YOU PASS AN INDEX TO REMOVE, YOU REMOVE A VALUE FROM SUM!!!
        }
    }
}
