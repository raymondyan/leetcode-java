import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution103 {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    if (root == null){
      return new ArrayList<>();
    }
    int level = 0;
    int val = root.val;
    List<TreeNode> next = new ArrayList<>();
    next.add(root);
    List<TreeNode> here;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> step;
    while (next.size() > 0) {
      step = new ArrayList<>();
      here = next;
      next = new ArrayList<>();
      for (TreeNode treeNode : here) {
        step.add(treeNode.val);
        if (treeNode.left != null) {
          next.add(treeNode.left);
        }
        if (treeNode.right != null) {
          next.add(treeNode.right);
        }
      }
      if (level % 2 != 0) {
        List<Integer> reverse = new ArrayList<>();
        for (int i = step.size() - 1; i >= 0; i--) {
          reverse.add(step.get(i));
        }
        res.add(reverse);
      } else {
        res.add(step);
      }
      level++;
    }
    return res;
  }
}
