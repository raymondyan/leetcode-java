import static org.junit.jupiter.api.Assertions.*;

import common.TreeNode;
import org.junit.jupiter.api.Test;

class Solution108Test {

  private final Solution108 solution108 = new Solution108();

  @Test
  void name() {
    int[] nums = {-10, -3, 0, 5, 9};
    TreeNode res = solution108.sortedArrayToBST(nums);
    int[] ints = res.treeHeights();
    assertTrue(Math.abs(ints[0] - ints[1]) <= 1);
  }
}