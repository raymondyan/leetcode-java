import static org.junit.jupiter.api.Assertions.*;

import common.TreeNode;
import org.junit.jupiter.api.Test;

class Solution104Test {

  private final Solution104 solution104 = new Solution104();

  @Test
  void test() {
    TreeNode treeNode = new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
    int res = solution104.maxDepth(treeNode);
    assertEquals(3, res);
  }
}