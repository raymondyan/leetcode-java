public class Solution463 {
  public int islandPerimeter(int[][] grid) {
    int res = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] > 0) {
          res += calculateSingleIslandPerimeter(i, j, grid);
        }
      }
    }
    return res;
  }

  private int calculateSingleIslandPerimeter(int i, int j, int[][] grid) {
    int single = 4;
    if (i > 0) {
      single -= grid[i - 1][j];
    }
    if (i < grid.length - 1) {
      single -= grid[i + 1][j];
    }
    if (j > 0) {
      single -= grid[i][j - 1];
    }
    if (j < grid[0].length - 1) {
      single -= grid[i][j + 1];
    }
    return single;
  }
}
