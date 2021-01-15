import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution171Test {

  private final Solution171 solution171 = new Solution171();

  @Test
  void name() {
    assertEquals(1, solution171.titleToNumber("A"));
    assertEquals(28, solution171.titleToNumber("AB"));
    assertEquals(701, solution171.titleToNumber("ZY"));
  }
}