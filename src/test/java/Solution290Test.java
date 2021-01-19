import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution290Test {

  private final Solution290 solution290 = new Solution290();

  @Test
  void name() {
    assertTrue(solution290.wordPattern("abba","dog cat cat dog"));
    assertFalse(solution290.wordPattern("abba","dog cat cat fish"));
    assertFalse(solution290.wordPattern("aaaa","dog cat cat dog"));
    assertFalse(solution290.wordPattern("abba","dog dog dog dog"));
  }
}