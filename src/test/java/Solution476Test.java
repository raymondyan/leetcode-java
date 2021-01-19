import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution476Test {

  private final Solution476 solution476 = new Solution476();

  @Test
  void test1() {
    assertEquals(2, solution476.findComplement(5));
  }

  @Test
  void test2() {
    assertEquals(0, solution476.findComplement(1));
  }
}