import static org.junit.jupiter.api.Assertions.*;

import common.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution103Test {

  private final Solution103 solution103 = new Solution103();

  @Test
  void test1() {
    List<List<Integer>> res = solution103
        .zigzagLevelOrder(new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7}));
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Collections.singletonList(3));
    expected.add(Arrays.asList(20,9));
    expected.add(Arrays.asList(15,7));
    assertEquals(expected, res);
  }
}