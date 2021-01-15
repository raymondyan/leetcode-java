import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution49Test {

  private final Solution49 solution49 = new Solution49();

  @Test
  void name() {
    List<List<String>> res = solution49
        .groupAnagrams2(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    for (List<String> group : res) {
      Collections.sort(group);
      switch (group.size()){
        case 1:
          assertEquals(Collections.singletonList("bat"), group);
          break;
        case 2:
          assertEquals(Arrays.asList("nat", "tan"), group);
          break;
        case 3:
          assertEquals(Arrays.asList("ate", "eat", "tea"), group);
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + group.size());
      }
    }
  }
}