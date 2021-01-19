import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution283Test {

  private final Solution283 solution283 = new Solution283();

  @Test
  void test1() {
    int[] nums = {0, 1, 0, 3, 12};
    solution283.moveZeroes(nums);
    assertArrayEquals(new int[]{1,3,12,0,0}, nums);
  }
}