import static org.junit.jupiter.api.Assertions.*;

import common.ListNode;
import org.junit.jupiter.api.Test;

class Solution206Test {
  private final Solution206 solution206 = new Solution206();

  @Test
  void name() {
    ListNode listNode = new ListNode(new int[]{1, 2, 3, 4, 5});
    ListNode res = solution206.reverseList(listNode);
    ListNode expect = new ListNode(new int[]{5, 4, 3, 2, 1});
    assertEquals(expect.toString(), res.toString());
  }
}