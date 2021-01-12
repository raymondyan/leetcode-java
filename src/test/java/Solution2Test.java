import static org.junit.jupiter.api.Assertions.*;

import common.ListNode;
import org.junit.jupiter.api.Test;

class Solution2Test {

  private final Solution2 solution2 = new Solution2();

  @Test
  void test1() {
    ListNode listNode1 = new ListNode(new int[]{2, 4, 3,});
    ListNode listNode2 = new ListNode(new int[]{5, 6, 4,});
    ListNode listNode = solution2.addTwoNumbers(listNode1, listNode2);
    assertEquals(new ListNode(new int[]{7,0,8}).toString(), listNode.toString());
  }

  @Test
  void test2() {
    ListNode listNode1 = new ListNode(new int[]{0});
    ListNode listNode2 = new ListNode(new int[]{0});
    ListNode listNode = solution2.addTwoNumbers(listNode1, listNode2);
    assertEquals(new ListNode(new int[]{0}).toString(), listNode.toString());
  }

  @Test
  void test3() {
    ListNode listNode1 = new ListNode(new int[]{9,9,9,9,9,9,9});
    ListNode listNode2 = new ListNode(new int[]{9,9,9,9});
    ListNode listNode = solution2.addTwoNumbers(listNode1, listNode2);
    assertEquals(new ListNode(new int[]{8,9,9,9,0,0,0,1,}).toString(), listNode.toString());
  }
}