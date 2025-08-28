package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> combs = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, combs, 0, new ArrayList<>(), 0);
        return combs;
    }
    public void dfs(int [] candidates, int target, List<List<Integer>> combs, int i, List<Integer> current, int total) {
        if (total == target) {
            combs.add(new ArrayList<>(current));
            return; // YOU HAD FORGOTTEN THE RETURN HERE!!! BASE CASE!!!
        }
        if (total > target || i >= candidates.length)
            return;

        current.add(candidates[i]); // Add the number we're at
        dfs(candidates, target, combs, i, current, total + candidates[i]); // Go into the path of the tree where you add the number you're at
        current.removeLast(); // Remove the last number
        dfs(candidates, target, combs, i + 1, current, total); // You cannot add the number at i anymore.
    }
}
