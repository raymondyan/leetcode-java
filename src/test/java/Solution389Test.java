import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution389Test {
  private final Solution389 solution389 = new Solution389();

  @Test
  void test1() {
    char res = solution389.findTheDifference("abcd", "abcde");
    assertEquals('e', res);
  }

  @Test
  void test2() {
    char res = solution389.findTheDifference("", "y");
    assertEquals('y', res);
  }

  @Test
  void test3() {
    char res = solution389.findTheDifference("a", "aa");
    assertEquals('a', res);
  }

  @Test
  void test4() {
    char res = solution389.findTheDifference("ae", "aea");
    assertEquals('a', res);
  }

}