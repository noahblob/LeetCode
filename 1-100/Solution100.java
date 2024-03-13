public class Solution100 {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q != null || p != null && q == null) {
      return false;
    }

    if (p == null && q == null) {
      return true;
    }

    boolean sameLeft = isSameTree(p.left, q.left);
    boolean sameRight = isSameTree(p.right, q.right);

    return p.val == q.val && sameLeft && sameRight;
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