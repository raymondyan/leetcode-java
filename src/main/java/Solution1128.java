public class Solution1128 {
  public int numEquivDominoPairs(int[][] dominoes) {
    int[] ints = new int[100];
    int res = 0;
    for (int[] dominoe : dominoes) {
      int i = dominoe[0];
      int j = dominoe[1];
      int x = Math.max(i, j) * 10 + Math.min(i, j);
      res += ints[x];
      ints[x]++;
    }
    return res;
  }
}
