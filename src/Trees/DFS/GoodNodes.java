package Trees.DFS;

public class GoodNodes {
    public int goodNodes(TreeNode root) {
        return countGood(root, root.val);
    }
    public int countGood(TreeNode root, int max) { // We made a new function because we need to pass max to each function call.
        // Why? Because we need to keep track of the max so far for each node. It will never be passed a max from the opposite side of the tree, or anywhere not on its path.
        if (root == null) // NEVER FORGET THE BASE CASE!
            return 0;
        int result = root.val >= max ? 1 : 0; // Is it a good node?
        max = Math.max(max, root.val); // Update the max
        result += countGood(root.left, max); // Add to the result the count on the left and right
        result += countGood(root.right, max);
        return result;
    }
}
