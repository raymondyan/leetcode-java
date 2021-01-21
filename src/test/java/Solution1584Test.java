import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution1584Test {

  private final Solution1584 solution1584 = new Solution1584();

  @Test
  void test1() {
    int res = solution1584.minCostConnectPoints(new int[][]{{0, 0}});
    assertEquals(0, res);
  }

  @Test
  void test2() {
    int res = solution1584.minCostConnectPoints(new int[][]{{-1000000, -1000000},{1000000,1000000}});
    assertEquals(4000000, res);
  }

  @Test
  void test3() {
    int res = solution1584.minCostConnectPoints(new int[][]{{3, 12},{-2,5},{-4,1}});
    assertEquals(18, res);
  }

  @Test
  void test4() {
    int res = solution1584.minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}});
    assertEquals(20, res);
  }

  @Test
  void test5() {
    int res = solution1584.minCostConnectPoints(new int[][]{{2, -3}, {-17, -8}, {13, 8}, {-17, -15}});
    assertEquals(53, res);
  }
}