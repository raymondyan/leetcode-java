import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution1Test {

  private final Solution1 solution1 = new Solution1();

  @Test
  void test1() {
    int[] nums = {2,7,11,15};
    int[] res = solution1.twoSum(nums, 9);
    assertArrayEquals(new int[]{0, 1},res);
  }

  @Test
  void test2() {
    int[] nums = {3,2,4};
    int[] res = solution1.twoSum(nums, 6);
    assertArrayEquals(new int[]{1,2},res);
  }

  @Test
  void test3() {
    int[] nums = {3,3};
    int[] res = solution1.twoSum(nums, 6);
    assertArrayEquals(new int[]{0, 1},res);
  }
}