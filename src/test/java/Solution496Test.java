import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution496Test {

  private final Solution496 solution496 = new Solution496();

  @Test
  void test1() {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    int[] res = solution496.nextGreaterElement(nums1, nums2);
    assertArrayEquals(new int[]{-1, 3, -1}, res);
  }

  @Test
  void test2() {
    int[] nums1 = {2, 4};
    int[] nums2 = {1, 2, 3, 4};
    int[] res = solution496.nextGreaterElement(nums1, nums2);
    assertArrayEquals(new int[]{3, -1}, res);
  }
}