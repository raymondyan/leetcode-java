import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution344Test {

  private final Solution344 solution344 = new Solution344();

  @Test
  void test1() {
    String hello = solution344.reverseString("hello");
    assertEquals("olleh", hello);
  }
}