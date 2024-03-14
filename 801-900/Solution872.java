import java.util.ArrayList;
import java.util.List;

public class Solution872 {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> leaf1 = new ArrayList<>();
    List<Integer> leaf2 = new ArrayList<>();
    findLeaf(root1, leaf1);
    findLeaf(root2, leaf2);

    if (leaf1.size() != leaf2.size()) {
      return false;
    }

    int j = 0;
    for (int i : leaf1) {
      if (i != leaf2.get(j++)) {
        return false;
      }
    }

    return true;
  }

  public void findLeaf(TreeNode root, List<Integer> leaf) {
    if (root == null) {
      return;
    }

    if (root.left == null && root.right == null) {
      leaf.add(root.val);
      return;
    }

    findLeaf(root.left, leaf);
    findLeaf(root.right, leaf);
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