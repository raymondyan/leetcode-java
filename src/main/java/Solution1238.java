import java.util.ArrayList;
import java.util.List;

public class Solution1238 {
  public List<Integer> circularPermutation(int n, int start) {
    List<Integer> res = new ArrayList<>();
    res.add(start);
    int lab = 1;
    for(int i=0;i<n;i++){
      for(int j=lab-1;j>=0;j--){
        res.add(res.get(j)^lab);
      }
      lab <<= 1;
    }
    return res;
  }
}
