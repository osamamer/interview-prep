package Trees.DFS;

public class DiameterBinaryTree {
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return result;
    }
    int getHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        int maxHeight = Math.max(leftHeight, rightHeight);

        result = Math.max(result, leftHeight + rightHeight);
        return 1 + maxHeight;
    }
}
