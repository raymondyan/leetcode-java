public class Solution171 {
  public int titleToNumber(String s) {
    int res = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      int temp = (int) s.charAt(i) - 64;
      res += temp * Math.pow(26, s.length() - i - 1);
    }
    return res;
  }
}