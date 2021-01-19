import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution257 {

  List<String> res = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return res;
    }
    binaryTreePath(root, "");
    return res;
  }

  private void binaryTreePath(TreeNode treeNode, String pathString) {
    pathString += String.valueOf(treeNode.val);
    if (treeNode.left == null && treeNode.right == null) {
      res.add(pathString);
    } else {
      if (treeNode.left != null) {
        binaryTreePath(treeNode.left, pathString + "->");
      }
      if (treeNode.right != null) {
        binaryTreePath(treeNode.right, pathString + "->");
      }
    }
  }
}

