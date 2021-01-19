public class Solution283 {
  public void moveZeroes(int[] nums) {
    int forwards = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (num == 0) {
        ++forwards;
      } else {
        nums[i - forwards] = num;
      }
    }
    for (int i = 0; i < forwards; i++) {
      nums[nums.length - i - 1] = 0;
    }
  }
}
