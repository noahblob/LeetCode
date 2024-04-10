import java.util.HashMap;
import java.util.Map;

public class Solution437 {
  // map to store prefix sums
  Map<Long, Integer> map = new HashMap<>();
  int numPaths = 0;

  public int pathSum(TreeNode root, int targetSum) {
    dfs(root, targetSum, 0);

    return numPaths;
  }

  void dfs(TreeNode node, int targetSum, long currentSum) {
    if (node == null) {
      return;
    }

    currentSum += node.val;

    // if the sum starting at the root is target sum
    if (currentSum == targetSum) {
      numPaths += 1;
    }

    // if there is a subpath that has current sum
    if (map.containsKey(currentSum - targetSum)) {
      numPaths += map.get(currentSum - targetSum);
    }

    map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

    dfs(node.left, targetSum, currentSum);
    dfs(node.right, targetSum, currentSum);

    map.put(currentSum, map.get(currentSum) - 1);
  }

  public class TreeNode {
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
}
