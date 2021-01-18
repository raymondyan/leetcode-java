import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution1238Test {

  private final Solution1238 solution1238 = new Solution1238();

  @Test
  void test1() {
    List<Integer> res = solution1238.circularPermutation(2, 3);
    assertTrue(compare(res, 2));
    assertEquals(3, res.get(0));
  }

  @Test
  void test2() {
    List<Integer> res = solution1238.circularPermutation(3, 2);
    assertTrue(compare(res, 3));
    assertEquals(2, res.get(0));
  }

  private boolean compare(List<Integer> res, int n){
    List<Integer> standard = new ArrayList<>();
    boolean compared = true;
    for (int i = 0; i < n; i++) {
      standard.add((int) Math.pow(2, i));
    }
    for (int i = 0; i < res.size()-1; i++) {
      int compare = res.get(i) ^ res.get(i + 1);
      compared &= standard.contains(compare);
    }
    compared &= standard.contains(res.get(res.size()-1) ^ res.get(0));
    return compared;
  }
}