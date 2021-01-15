import java.util.ArrayDeque;

class Solution232 {

  ArrayDeque<Object> elements = new ArrayDeque<>();

  /** Initialize your data structure here. */
  public Solution232() {
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    elements.offerLast(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() throws Exception {
    if (elements.isEmpty()) {
      throw new Exception();
    } else {
     return (int) elements.pollFirst();
    }
  }

  /** Get the front element. */
  public int peek() {
    return (int) elements.getFirst();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return elements.isEmpty();
  }
}