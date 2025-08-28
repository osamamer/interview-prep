package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int [] combs = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(combs, 8));
    }
    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean [] used = new boolean [candidates.length];
        dfs(candidates, target, result, 0, new ArrayList<>(), 0);
        return result;
    }
    public static void dfs(int[] candidates, int target, List<List<Integer>> result, int i,  List<Integer> current, int total) {
        if (total == target) {
            result.add(new ArrayList<>(current)); // NOT RESULT.ADD(CURRENT)!!!!
            return;
        }
        if (i >= candidates.length) {
            return;
        }
        if (total > target) {
            current.removeLast();
            dfs(candidates, target, result, i + 1, current, total - candidates[i]);
            return;
        }
        current.add(candidates[i]);
        dfs(candidates, target, result, i + 1, current, total + candidates[i]);
        current.removeLast();
    }
}
