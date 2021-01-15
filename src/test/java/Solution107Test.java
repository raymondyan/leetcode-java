import static org.junit.jupiter.api.Assertions.*;

import common.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution107Test {
  private final Solution107 solution107 = new Solution107();

  @Test
  void name() {
    TreeNode treeNode = new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(15,7));
    expect.add(Arrays.asList(9,20));
    expect.add(Collections.singletonList(3));
    assertEquals(expect, solution107.levelOrderBottom(treeNode));
  }
}