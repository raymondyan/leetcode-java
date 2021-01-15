import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution232Test {

  @Test
  void name() throws Exception {
    Solution232 myQueue = new Solution232();
    myQueue.push(1);
    myQueue.push(2);
    int peek = myQueue.peek();
    Assertions.assertEquals(1, peek);
    int pop = myQueue.pop();
    Assertions.assertEquals(1, pop);
    int pop1 = myQueue.pop();
    Assertions.assertEquals(2, pop1);
    myQueue.empty();
  }
}