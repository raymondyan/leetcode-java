import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution461Test {

  @Test
  void test1() {
    Solution461 solution461 = new Solution461();
    int res = solution461.hammingDistance(1, 4);
    assertEquals(2, res);
  }
}