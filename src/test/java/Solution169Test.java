import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution169Test {
  private final Solution169 solution169 = new Solution169();

  @Test
  void name() {
    assertEquals(3, solution169.majorityElement(new int[]{3,2,3}));
    assertEquals(2, solution169.majorityElement(new int[]{2,2,1,1,1,2,2}));
  }
}