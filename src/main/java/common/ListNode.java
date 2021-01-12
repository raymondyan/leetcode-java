package common;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public ListNode(int[] y){
    val = y[0];
    ListNode next = null;

    for (int i = y.length - 1; i > 0; i--) {
      ListNode listNode = new ListNode(y[i]);
      listNode.next = next;
      next = listNode;
    }

    this.next = next;
  }
}
