import java.util.HashMap;

public class Solution1 {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int rest = target - nums[i];
      if (hashMap.containsKey(rest)) {
        return new int[]{hashMap.get(rest),i};
      } hashMap.put(nums[i], i);
    }
    throw new IllegalArgumentException("No results");
  }
}
