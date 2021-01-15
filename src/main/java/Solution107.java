import common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution107 {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList<TreeNode> current = new LinkedList<>();
    LinkedList<TreeNode> next = new LinkedList<>();
    LinkedList<List<Integer>> res = new LinkedList<>();
    if(root == null) {
      return res;
    }
    current.add(root);
    List<Integer> line = new ArrayList<>();

    while (!current.isEmpty()) {
      TreeNode first = current.poll();
      line.add(first.val);
      if (first.left != null) next.add(first.left);
      if (first.right != null) next.add(first.right);
      if (current.isEmpty()) {
        current = next;
        next = new LinkedList<>();
        res.addFirst(line);
        line = new ArrayList<>();
      }
    }
    return res;
  }
}