import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import common.ListNode;
import org.junit.jupiter.api.Test;

class Solution234Test {

  private final Solution234 solution234 = new Solution234();

  @Test
  void test1() {
    ListNode listNode = new ListNode(new int[]{1, 2});
    assertFalse(solution234.isPalindrome(listNode));
  }

  @Test
  void test2() {
    ListNode listNode = new ListNode(new int[]{1, 2, 2, 1});
    assertTrue(solution234.isPalindrome(listNode));
  }
}