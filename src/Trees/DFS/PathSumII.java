package Trees.DFS;

import java.util.ArrayList;
import java.util.List;

public class PathSumII { // FIRST TRY BABYYYYYYYYYYYYYY!!
    List<List<Integer>> paths = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return paths;
    }
    public void dfs(TreeNode root, int targetSum, List<Integer> curr) {
        if (root == null) return;
        if (root.left == null && root.right == null && targetSum == root.val) {
            curr.add(root.val);
            paths.add(new ArrayList<>(curr));
            return;
        }
        curr.add(root.val);
        dfs(root.left, targetSum - root.val, new ArrayList<>(curr));
        dfs(root.right, targetSum - root.val, new ArrayList<>(curr));
    }
    private void dfs2(TreeNode root, int targetSum, List<Integer> curr) { // More efficient backtracking solution
        if (root == null) return;

        curr.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            paths.add(new ArrayList<>(curr)); // only copy here!
        } else {
            dfs(root.left, targetSum - root.val, curr);
            dfs(root.right, targetSum - root.val, curr);
        }

        curr.remove(curr.size() - 1); // backtrack
    }
}
