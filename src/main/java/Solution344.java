public class Solution344 {
  public String reverseString(String s) {
    char[] chars = s.toCharArray();
    StringBuilder res = new StringBuilder();
    for(int i = chars.length - 1; i >= 0; i--) {
      res.append(chars[i]);
    }
    return res.toString();
  }
}
