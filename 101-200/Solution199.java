import java.util.ArrayList;
import java.util.List;

public class Solution199 {
  int maxDepth = 0;

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> seen = new ArrayList<>();
    if (root == null) {
      return seen;
    }

    canSee(root, seen, 1);

    return seen;
  }

  public void canSee(TreeNode root, List<Integer> seen, int depth) {
    if (root == null) {
      return;
    }

    if (maxDepth < depth) {
      seen.add(root.val);
      maxDepth = depth;
    }

    // go down a level either side of the tree
    canSee(root.right, seen, depth + 1);
    canSee(root.left, seen, depth + 1);
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
