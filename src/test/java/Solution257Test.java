import common.TreeNode;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution257Test {
  private final Solution257 solution257 = new Solution257();

  @Test
  void test1() {
    TreeNode treeNode = new TreeNode(new Integer[]{1, 2, 3, null, 5});
    List<String> res = solution257.binaryTreePaths(treeNode);
    List<String> expect = Arrays.asList("1->2->5", "1->3");
    Assertions.assertEquals(expect, res);
  }
}