import java.util.ArrayList;
import java.util.List;

public class Solution119 {

  public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<>();
    long value = 1;
    res.add((int)value);
    for (int i = 0; i < rowIndex; i++) {
      value *= rowIndex - i;
      value /= i + 1;
      res.add((int)value);
    }
    return res;
  }
}
