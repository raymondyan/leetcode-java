import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution387Test {
  private final Solution387 solution387 = new Solution387();

  @Test
  void test1() {
    int res = solution387.firstUniqChar("leetcode");
    assertEquals(0, res);
  }

  @Test
  void test2() {
    int res = solution387.firstUniqChar("loveleetcode");
    assertEquals(2, res);
  }
}