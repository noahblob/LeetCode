public class Solution572 {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (subRoot == null) {
      return true;
    }
    if (root == null) {
      return false;
    }

    if (isSameTree(root, subRoot)) {
      return true;
    }

    // is subroot a subtree of left or right?
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

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
