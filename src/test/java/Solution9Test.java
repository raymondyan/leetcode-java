import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution9Test {

  private final Solution9 solution9 = new Solution9();

  @Test
  void test() {
    assertTrue(solution9.isPalindrome(121));
    assertFalse(solution9.isPalindrome(-121));
    assertFalse(solution9.isPalindrome(10));
  }
}