import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Solution547Test {

  private final Solution547 solution547 = new Solution547();

  @Test
  void test1() {
    int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    int res = solution547.findCircleNum(isConnected);
    assertEquals(2, res);
  }
}