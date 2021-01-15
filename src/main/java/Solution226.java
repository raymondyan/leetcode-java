import common.TreeNode;

public class Solution226 {
  public TreeNode invertTree(TreeNode root) {
    if(root != null) {
      TreeNode left = root.left;
      root.left = root.right;
      root.right = left;
      invertTree(root.left);
      invertTree(root.right);
    }
    return root;
  }
}