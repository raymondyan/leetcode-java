import java.util.HashMap;

public class Solution496 {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> parents = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      parents.put(nums2[i], i);
    }
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int compareValue = nums1[i];
      res[i] = -1;
      for (int j = parents.get(compareValue) + 1; j < nums2.length; j++){
        if(nums2[j] > compareValue) {
          res[i] = nums2[j];
          break;
        }
      }
    }
    return res;
  }
}
