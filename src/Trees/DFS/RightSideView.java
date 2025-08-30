package Trees.DFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RightSideView {
    List<Integer> output = new ArrayList<>();
    HashSet<Integer> levelsExplored = new HashSet<>();
    public List<Integer> rightSideView(TreeNode root) { // FIRST FUCKING TRY AFTER LOTS OF TINKERING!!!!!!
        dfs(root, 0);
        return output;
    }
    public void dfs(TreeNode root, int level) {
        if (root == null)
            return;
        if (!levelsExplored.contains(level)) {
            output.add(root.val);
        }
        levelsExplored.add(level);
        dfs(root.right, level + 1);
        dfs(root.left, level + 1);
    }
}
