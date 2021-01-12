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

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(val).append(",");
    ListNode nextNode = next;
    while (nextNode != null) {
      stringBuilder.append(nextNode.val).append(",");
      nextNode = nextNode.next;
    }
    return stringBuilder.toString();
  }
}
