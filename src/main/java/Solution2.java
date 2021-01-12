import common.ListNode;

public class Solution2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int firstNum = l1.val + l2.val;
    int flag = firstNum / 10;
    int storedNum = firstNum - 10 * flag;
    ListNode res = new ListNode(storedNum);
    ListNode pointer = res;
    l1 = l1.next;
    l2 = l2.next;
    while (l1 != null && l2 != null) {
      int i = l1.val + l2.val + flag;
      flag = i / 10;
      storedNum = i - 10 * flag;
      ListNode next = new ListNode(storedNum);
      pointer.next = next;
      pointer = next;
      l1 = l1.next;
      l2 = l2.next;
    }
    ListNode rest = l1 != null ? l1 : l2;
    while (rest != null) {
      int i = rest.val + flag;
      flag = i / 10;
      storedNum = i - 10 * flag;
      ListNode next = new ListNode(storedNum);
      pointer.next = next;
      pointer = next;
      rest = rest.next;
    }
    if(flag > 0) {
      pointer.next = new ListNode(flag);
    }
    return res;
  }
}
