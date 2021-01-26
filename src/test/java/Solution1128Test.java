import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution1128Test {

  private final Solution1128 solution1128 = new Solution1128();

  @Test
  void name() {
    int[][] ints = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    int res = solution1128.numEquivDominoPairs(ints);
    assertEquals(1, res);
  }
}