package Trees.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int queueSize = queue.size(); // EXTREMELY IMPORTANT BECAUSE THE SIZE OF THE QUEUE WILL CHANGE INSIDE THE LOOP
            for (int i = 0; i < queueSize; i++) {
                TreeNode top = queue.poll();
                if (top != null) {
                    level.add(top.val);
                    queue.add(top.left);
                    queue.add(top.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }
        return result;
    }
}
