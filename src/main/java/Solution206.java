import common.ListNode;
import java.util.LinkedList;

public class Solution206 {
  public ListNode reverseList(ListNode head) {
    if(head == null) return null;
    LinkedList<Integer> register = new LinkedList<>();
    ListNode next = head;
    while (next != null) {
      register.addFirst(next.val);
      next = next.next;
    }
    Integer first = 0;
    if (!register.isEmpty()) first = register.pollFirst();
    head = new ListNode(first);
    next = head;
    while (!register.isEmpty())  {
      first = register.pollFirst();
      ListNode node = new ListNode(first);
      next.next = node;
      next = node;
    }
    return head;
  }
}
