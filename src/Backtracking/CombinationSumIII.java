package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    List<List<Integer>> combs = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k, n, 0, new ArrayList<>(), 1);
        return combs;
    }
    public void backtrack(int k, int n, int sum, List<Integer> current, int start) {
        if (sum == n && current.size() == k) {
            combs.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (current.size() >= k) {
                continue;
            }
            if (sum > n) {
                return;
            }
            sum += i;
            current.add(i);
            backtrack(k, n, sum, current, start + 1);
            sum -= i;
//            current.removeLast();
        }
    }
}
