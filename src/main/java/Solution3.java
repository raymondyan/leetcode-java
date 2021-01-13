import java.util.HashSet;

public class Solution3 {
  public int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    HashSet<Object> set = new HashSet<>();
    int i = 0, j = 0, maxSize = 0;
    while (i < chars.length && j < chars.length) {
      if (!set.contains(chars[i])) {
        set.add(chars[i++]);
        maxSize = Math.max(maxSize, i - j);
      } else {
        set.remove(chars[j++]);
      }
    }
    return maxSize;
  }
}
