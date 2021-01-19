import java.util.HashMap;
import java.util.Map;

public class Solution387 {
  public int firstUniqChar(String s) {
    Map<Character, Integer> frequency = new HashMap<>();
    for (int i = 0; i < s.length(); ++i) {
      char ch = s.charAt(i);
      frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < s.length(); ++i) {
      if (frequency.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
