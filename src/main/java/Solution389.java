public class Solution389 {
  public char findTheDifference(String s, String t) {
    int[] d = new int[26];
    String longStr = s.length() > t.length() ? s : t;
    String shortStr = s.length() <= t.length() ? s : t;
    for (int i = 0; i < longStr.length() - 1; i++) {
      d[(int) longStr.charAt(i) - 97] += 1;
      d[(int) shortStr.charAt(i) - 97] -= 1;
    }
    d[(int) longStr.charAt(longStr.length() - 1) - 97] += 1;
    for (int i = 0; i < d.length; i++) {
      if (d[i]>0){
        return (char) ((char) i+97);
      }
    }
    return 0;
  }
}
