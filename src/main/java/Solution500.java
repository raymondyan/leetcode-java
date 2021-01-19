import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution500 {
  public String[] findWords(String[] words) {
    HashMap<Character, Integer> keymap = new HashMap<>();
    keymap.put('Q', 1);
    keymap.put('W', 1);
    keymap.put('E', 1);
    keymap.put('R', 1);
    keymap.put('T', 1);
    keymap.put('Y', 1);
    keymap.put('U', 1);
    keymap.put('I', 1);
    keymap.put('O', 1);
    keymap.put('P', 1);
    keymap.put('A', 2);
    keymap.put('S', 2);
    keymap.put('D', 2);
    keymap.put('F', 2);
    keymap.put('G', 2);
    keymap.put('H', 2);
    keymap.put('J', 2);
    keymap.put('K', 2);
    keymap.put('L', 2);
    keymap.put('Z', 3);
    keymap.put('X', 3);
    keymap.put('C', 3);
    keymap.put('V', 3);
    keymap.put('B', 3);
    keymap.put('N', 3);
    keymap.put('M', 3);
    List<String> res = new ArrayList<>(words.length);
    for (String element : words) {
      char[] chars = element.toCharArray();
      int lineOfFirstCharacter = keymap.get(Character.toUpperCase(chars[0]));
      boolean flag = true;
      for (Character i : chars) {
        if (keymap.get(Character.toUpperCase(i)) != lineOfFirstCharacter) {
          flag = false;
          break;
        }
      }
      if (flag) {
        res.add(element);
      }
    }
    return res.toArray(new String[0]);
  }
}
