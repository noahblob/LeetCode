public class Solution700 {
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

  public TreeNode searchBST(TreeNode root, int val) {
    while (root != null) {
      if (val < root.val) {
        root = root.left;
      } else if (val > root.val) {
        root = root.right;
      } else {
        return root;
      }
    }
    return null;
  }
}
