public class Solution543 {
  int diameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    dfs(root);
    return diameter;
  }

  public int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int left = dfs(root.left);
    int right = dfs(root.right);

    diameter = Math.max(left + right, diameter);

    return Math.max(left, right) + 1;
  }
}
