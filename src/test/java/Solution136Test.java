import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution136Test {

  private final Solution136 solution136 = new Solution136();

  @Test
  void name() {
    assertEquals(1, solution136.singleNumber(new int[]{2,2,1}));
    assertEquals(4, solution136.singleNumber(new int[]{4,1,2,1,2}));
  }
}