import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution959Test {

  private final Solution959 solution959 = new Solution959();

  @Test
  void test1() {
    int res = solution959.regionsBySlashes(new String[]{" /", "/ "});
    assertEquals(2, res);
  }

  @Test
  void test2() {
    int res = solution959.regionsBySlashes(new String[]{" /", "  "});
    assertEquals(1, res);
  }

  @Test
  void test3() {
    int res = solution959.regionsBySlashes(new String[]{"\\/", "/\\"});
    assertEquals(4, res);
  }

  @Test
  void test4() {
    int res = solution959.regionsBySlashes(new String[]{"/\\", "\\/"});
    assertEquals(5, res);
  }

  @Test
  void test5() {
    int res = solution959.regionsBySlashes(new String[]{"//", "/ "});
    assertEquals(3, res);
  }

  @Test
  void check() {
    String s = "/ \\";
  }
}