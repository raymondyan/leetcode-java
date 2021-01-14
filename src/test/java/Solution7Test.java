import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution7Test {

  private final Solution7 solution7 = new Solution7();

  @Test
  void test1() {
    int res = solution7.reverse(123);
    assertEquals(321, res);
  }
  @Test
  void test2() {
    int res = solution7.reverse(-123);
    assertEquals(-321, res);
  }
  @Test
  void test3() {
    int res = solution7.reverse(120);
    assertEquals(21, res);
  }
  @Test
  void test4() {
    int res = solution7.reverse(0);
    assertEquals(0, res);
  }

  @Test
  void test5() {
    int res = solution7.reverse(1534236469);
    assertEquals(0, res);
  }
}