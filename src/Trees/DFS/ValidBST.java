package Trees.DFS;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        // left must be < node.val, right must be > node.val
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max); // You just change the range
        // for left and right, not the condition. Fuck me.
    }
}
