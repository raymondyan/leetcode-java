import common.ListNode;

public class Solution237 {

  ListNode head;

  public Solution237(ListNode head) {
    this.head = head;
  }

  public void deleteNode(ListNode node){
    ListNode next = node.next;
    node.val = next.val;
    node.next = next.next;
  }

}
