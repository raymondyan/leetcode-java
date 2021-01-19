import static org.junit.jupiter.api.Assertions.assertEquals;

import common.ListNode;
import org.junit.jupiter.api.Test;

class Solution237Test {


  ListNode head = new ListNode(new int[]{4, 5, 1, 9});
  Solution237 solution237 = new Solution237(head);

  @Test
  void test1() {
    solution237.deleteNode(head.next);
    assertEquals("4,1,9,", head.toString());
  }

  @Test
  void test2() {
    solution237.deleteNode(head.next.next);
    assertEquals("4,5,9,", head.toString());
  }
}