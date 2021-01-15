import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import common.TreeNode;
import org.junit.jupiter.api.Test;

class Solution226Test {

  private final Solution226 solution226 = new Solution226();

  @Test
  void name() {
    TreeNode root = new TreeNode(new Integer[]{4, 2, 7, 1, 3, 6, 9});
    TreeNode res = solution226.invertTree(root);
    TreeNode expect = new TreeNode(new Integer[]{4, 7, 2, 9, 6, 3, 1});
    assertArrayEquals(expect.toArray(), res.toArray());
  }
}