import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution118Test {

  private final Solution118 solution118 = new Solution118();

  @Test
  void name() {
    List<List<Integer>> generate = solution118.generate(5);
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Collections.singletonList(1));
    expect.add(Arrays.asList(1,1));
    expect.add(Arrays.asList(1,2,1));
    expect.add(Arrays.asList(1,3,3,1));
    expect.add(Arrays.asList(1,4,6,4,1));
    assertEquals(expect, generate);
  }
}