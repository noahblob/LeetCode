public class Solution1448 {
  public int goodNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return isGood(root, Integer.MIN_VALUE);
  }

  public int isGood(TreeNode node, int max) {
    int numGood = 0;

    if (node.val >= max) {
      numGood++;
    }

    if (node.left != null) {
      numGood += isGood(node.left, Math.max(node.val, max));
    }

    if (node.right != null) {
      numGood += isGood(node.right, Math.max(node.val, max));
    }

    return numGood;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {

  }

  TreeNode(int x) {
    val = x;
  }

  TreeNode(int x, TreeNode left, TreeNode right) {
    val = x;
    this.left = left;
    this.right = right;
  }
}
