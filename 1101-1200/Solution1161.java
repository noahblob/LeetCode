import java.util.LinkedList;
import java.util.Queue;

public class Solution1161 {
  public int maxLevelSum(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int maxLevel = 0;
    int curLevel = 0;
    int maxNum = Integer.MIN_VALUE;
    while (!q.isEmpty()) {
      // move down a level
      curLevel++;
      int size = q.size();
      int curSum = 0;
      for (int i = 0; i < size; i++) {
        // BFS searches per layer, iterate over every element on the current layer
        TreeNode node = q.remove();
        curSum += node.val;
        // start adding next layer to queue
        if (node.left != null) {
          q.add(node.left);
        }

        if (node.right != null) {
          q.add(node.right);
        }
      }
      if (curSum > maxNum) {
        maxNum = curSum;
        maxLevel = curLevel;
      }
    }
    return maxLevel;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
