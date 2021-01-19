import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution463Test {

  private final Solution463 solution463 = new Solution463();

  @Test
  void test1() {
    int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
    int res = solution463.islandPerimeter(grid);
    assertEquals(16, res);
  }

  @Test
  void test2() {
    int[][] grid = {{1}};
    int res = solution463.islandPerimeter(grid);
    assertEquals(4, res);
  }

  @Test
  void test3() {
    int[][] grid = {{1, 0}};
    int res = solution463.islandPerimeter(grid);
    assertEquals(4, res);
  }


}