import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution500Test {

  @Test
  void test() {
    Solution500 solution500 = new Solution500();
    String[] words = solution500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    assertArrayEquals(new String[]{"Alaska", "Dad"}, words);
  }
}