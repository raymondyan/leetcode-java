package common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListNodeTest {

  @Test
  void testBaseConstructor() {
    ListNode listNode = new ListNode(1);
    assertEquals(1, listNode.val);
    assertNull(listNode.next);
  }

  @Test
  void testIntArrayConstructor() {
    int[] a = {1,2,3};
    ListNode listNode = new ListNode(a);
    assertEquals(1, listNode.val);
    assertEquals(2, listNode.next.val);
    assertEquals(3, listNode.next.next.val);
    assertNull(listNode.next.next.next);
  }
}