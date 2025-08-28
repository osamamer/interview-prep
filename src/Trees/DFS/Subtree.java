package Trees.DFS;

public class Subtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false; // Base case
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); // Cascade of ORs!
    }
    public boolean isSameTree(TreeNode p, TreeNode q) { // FIRST TRY BABYYY
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // CASCADE OF ANDS!
    }
}
