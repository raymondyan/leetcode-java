import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution989Test {

  private final Solution989 solution989 = new Solution989();

  @Test
  void test1() {
    List<Integer> res = solution989.addToArrayForm(new int[]{1, 2, 0, 0}, 34);
    List<Integer> expect = Arrays.asList(1, 2, 3, 4);
    assertEquals(expect, res);
  }

  @Test
  void test2() {
    List<Integer> res = solution989.addToArrayForm(new int[]{2, 7, 4}, 181);
    List<Integer> expect = Arrays.asList(4, 5, 5);
    assertEquals(expect, res);
  }

  @Test
  void test3() {
    List<Integer> res = solution989.addToArrayForm(new int[]{2, 1, 5}, 806);
    List<Integer> expect = Arrays.asList(1, 0, 2, 1);
    assertEquals(expect, res);
  }

  @Test
  void test4() {
    List<Integer> res = solution989.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1);
    List<Integer> expect = Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    assertEquals(expect, res);
  }

  @Test
  void test6() {
    List<Integer> res = solution989.addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516);
    List<Integer> expect = Arrays.asList(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9);
    assertEquals(expect, res);
  }


  @Test
  void test7() {
    List<Integer> res = solution989.addToArrayForm(new int[]{0}, 516);
    List<Integer> expect = Arrays.asList(5,1,6);
    assertEquals(expect, res);
  }


  @Test
  void test5() {
    List<Integer> res = solution989.addToArrayForm(new int[]{0}, 0);
    List<Integer> expect = Collections.singletonList(0);
    assertEquals(expect, res);
  }

  @Test
  void testTransformer() {
    long i = solution989.transformIntegerListIntoInteger(new int[]{1, 2, 3, 4});
    assertEquals(1234,i);
  }
}