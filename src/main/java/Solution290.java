import java.util.HashMap;
import java.util.Map;

public class Solution290 {
  public boolean wordPattern(String pattern, String s) {
    String[] s1 = s.split(" ");
    if (s1.length != pattern.length()) {
      return false;
    }
    Map<Character, String> stringHashMap = new HashMap<>();
    Map<String, Character> revertedMap = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char patternLetter = pattern.charAt(i);
      String valued = s1[i];
      if (stringHashMap.containsKey(patternLetter)) {
        String value = stringHashMap.get(patternLetter);
        if (!value.equals(valued)) {
          return false;
        }
      } else {
        if (revertedMap.containsKey(valued)) {
          return false;
        } else {
          revertedMap.put(valued, patternLetter);
          stringHashMap.put(patternLetter, valued);
        }
      }
    }
    return true;
  }
}
