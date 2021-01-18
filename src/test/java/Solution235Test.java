import static org.junit.jupiter.api.Assertions.*;

import com.sun.source.tree.Tree;
import common.TreeNode;
import org.junit.jupiter.api.Test;

class Solution235Test {

  private final Solution235 solution235 = new Solution235();

  @Test
  void test1() {
    TreeNode root = new TreeNode(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
    TreeNode res = solution235.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));
    assertEquals(6, res.val);
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
    TreeNode res = solution235.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4));
    assertEquals(2, res.val);
  }
}