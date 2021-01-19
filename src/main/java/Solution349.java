import java.util.HashSet;

public class Solution349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> temp = new HashSet<>();
    HashSet<Integer> numSet = new HashSet<>();
    for (int i : nums1) {
      numSet.add(i);
    }
    for (int i : nums2) {
      if(numSet.contains(i)){
        temp.add(i);
      }
    }
    Integer[] mediate = temp.toArray(new Integer[]{});
    int length = mediate.length;
    int[] res = new int[length];
    for (int i = 0; i < length; i++) {
      res[i] = mediate[i];
    }
    return res;
  }
}
