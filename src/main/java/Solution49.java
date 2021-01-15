import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> stringHashMap = new HashMap<>();
    for (String str : strs){
      String sortedStr = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
      List<String> strings;
      if (stringHashMap.containsKey(sortedStr)){
        strings = stringHashMap.get(sortedStr);
      } else {
        strings = new ArrayList<>();
      }
      strings.add(str);
      stringHashMap.put(sortedStr, strings );
    }
    return new ArrayList<>(stringHashMap.values());
  }

  public List<List<String>> groupAnagrams2(String[] strs) {
    Map<String, List<String>> stringHashMap = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      List<String> list = stringHashMap.getOrDefault(key, new ArrayList<>());
      list.add(str);
      stringHashMap.put(key, list);
    }
    return new ArrayList<>(stringHashMap.values());
  }
}