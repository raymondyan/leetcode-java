import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution258Test {

  private final Solution258 solution258 = new Solution258();

  @Test
  void test1() {
    int res = solution258.addDigits(38);
    assertEquals(2, res);
  }
}