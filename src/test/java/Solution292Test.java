import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution292Test {

  private final Solution292 solution292= new Solution292();

  @Test
  void test1() {
    assertTrue(solution292.canWinNim(1));
    assertTrue(solution292.canWinNim(2));
    assertFalse(solution292.canWinNim(4));
  }
}