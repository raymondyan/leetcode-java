import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution13Test {

  private final Solution13 solution13 = new Solution13();

  @Test
  void test() {
    assertEquals(3, solution13.romanToInt("III"));
    assertEquals(4, solution13.romanToInt("IV"));
    assertEquals(9, solution13.romanToInt("IX"));
    assertEquals(58, solution13.romanToInt("LVIII"));
    assertEquals(1994, solution13.romanToInt("MCMXCIV"));
  }
}