package Trees.DFS;

public class LCABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while (current != null) {
            if (p.val < current.val && q.val < current.val) // If they're both less than current, they're in its left subtree.
                current = current.left;
            else if (p.val > current.val && q.val > current.val) {  // If they're both greater than current, they're in its right subtree.
                current = current.right;
            }
            else { // This means that you have either found one of the nodes, which means it is the LCA, OR that a split has occurred. Meaning they are now on separate sides, which
                // also means that you have found the LCA.
                return current;
            }
        }
        return current;
    }
}
