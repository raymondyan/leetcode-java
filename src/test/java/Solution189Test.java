import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Solution189Test {

  private final Solution189 solution189 = new Solution189();

  @Test
  void test1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    solution189.rotate(nums, 3);
    assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
  }

  @Test
  void test2() {
    int[] nums = {-1, -100, 3, 99};
    solution189.rotate(nums, 2);
    assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
  }

  @Test
  void testInverse() {
    solution189.inverseArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 4);
  }

  @Test
  void test2_1() {
    int[] nums = {-1, -100, 3, 99};
    solution189.rotate2(nums, 2);
    assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
  }

  @Test
  void test2_2() {
    int[] nums = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
    solution189.rotate2(nums, 234);
    assertArrayEquals(new int[]{7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6}, nums);
  }
}