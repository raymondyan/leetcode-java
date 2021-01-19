public class Solution461 {
  public int hammingDistance(int x, int y) {
    int pointer = Math.max(x, y);
    int count = 0;
    int res = 0;
    while (pointer  > 0) {
      boolean flag = (x & (0x1 << count)) >> count != (y & (0x1 << count)) >> count;
      if (flag) {
        res ++;
      }
      count ++;
      pointer /= 2;
    }
    return res;
  }
}
