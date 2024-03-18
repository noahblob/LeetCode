import java.util.HashMap;
import java.util.Map;

public class Solution1161 {
  Map<Integer, Integer> levelSum = new HashMap<>();

  public int maxLevelSum(TreeNode root) {
    maxSum(root, 1, levelSum);
    int maxNum = Integer.MIN_VALUE;
    int maxLevel = 1;

    for (Map.Entry<Integer, Integer> entry : levelSum.entrySet()) {
      if (entry.getValue() > maxNum) {
        maxNum = entry.getValue();
        maxLevel = entry.getKey();
      }
    }

    return maxLevel;
  }

  public void maxSum(TreeNode root, int level, Map<Integer, Integer> levelSum) {
    if (root == null) {
      return;
    }

    if (!levelSum.containsKey(level)) {
      levelSum.put(level, root.val);
    } else {
      levelSum.put(level, levelSum.get(level) + root.val);
    }

    maxSum(root.left, level + 1, levelSum);
    maxSum(root.right, level + 1, levelSum);
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
