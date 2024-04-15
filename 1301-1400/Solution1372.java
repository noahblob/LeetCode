public class Solution1372 {
  int longest;

  public int longestZigZag(TreeNode root) {
    longest = 0;
    // left is false
    zigZag(root.left, false, 0);
    // right is true
    zigZag(root.right, true, 0);

    return longest;
  }

  void zigZag(TreeNode node, boolean direction, int current) {
    longest = current > longest ? current : longest;

    if (node == null) {
      return;
    }

    if (direction == true) {
      // search left but also restart from right in case we can find a longer zigzag
      // that way
      zigZag(node.left, !direction, current + 1);

      zigZag(node.right, direction, 0);
    } else {
      zigZag(node.right, !direction, current + 1);

      zigZag(node.left, direction, 0);
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
}
