public class Solution258 {
  public int addDigits(int num) {
    return num == 0 ? num : num % 9 == 0 ? 9 : num % 9;
  }
}
