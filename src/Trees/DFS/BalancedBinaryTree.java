package Trees.DFS;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int leftDepth, rightDepth;
        if (root == null)
            return true;
        leftDepth = getDepth(root.left);
        rightDepth = getDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}
