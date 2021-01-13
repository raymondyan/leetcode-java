import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution3Test {

  private final Solution3 solution3 = new Solution3();

  @Test
  void test1() {
    int res = solution3.lengthOfLongestSubstring("abcabcbb");
    assertEquals(3, res);
  }

  @Test
  void test2() {
    int res = solution3.lengthOfLongestSubstring("bbbbb");
    assertEquals(1, res);
  }

  @Test
  void test3() {
    int res = solution3.lengthOfLongestSubstring("pwwkew");
    assertEquals(3, res);
  }

  @Test
  void test4() {
    int res = solution3.lengthOfLongestSubstring("");
    assertEquals(0, res);
  }
}