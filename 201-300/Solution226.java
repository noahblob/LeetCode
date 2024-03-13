public class Solution226 {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }

    // swap children
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertTree(root.left);
    invertTree(root.right);
    return root;
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
