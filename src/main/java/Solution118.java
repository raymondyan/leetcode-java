import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution118 {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>(numRows);
    if (numRows == 0) {
      return res;
    }
    List<Integer> last = new ArrayList<>(Collections.singletonList(1));
    res.add(last);
    for (int i = 2; i <= numRows; i++) {
      List<Integer> line = new ArrayList<>(i);
      for (int j = 0; j < i; j++) {
        if (j == 0 || j == i - 1) {
          line.add(1);
        } else line.add(last.get(j - 1) + last.get(j));
      }
      res.add(line);
      last = line;
    }
    return res;
  }
}