package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> combs = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, new ArrayList<>(), 0);
        return combs;
    }
    public void backtrack(int[] candidates, int target, int sum, List<Integer> current, int start) {
        if (sum == target) {
            combs.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (sum > target) {
                return;
            }
            current.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, sum, current, i);
            current.remove(current.size() - 1);
            sum -= candidates[i];
        }
    }
}
