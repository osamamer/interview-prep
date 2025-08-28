package Trees.DFS;

import java.util.ArrayList;
import java.util.List;

public class LeafSequence { // FIRST TRY BABYYYYYY!!!!!
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        formLeafSequence(root1, list1);
        formLeafSequence(root2, list2);

        return list1.equals(list2);
    }
    public static void formLeafSequence(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        if (root.left != null) {
            formLeafSequence(root.left, list);
        }
        if (root.right != null) {
            formLeafSequence(root.right, list);
        }
    }
}
