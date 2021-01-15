public class Solution9 {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int input = x;
    int last_digit;
    int reversedNum = 0;
    while (input != 0) {
      last_digit = input % 10;
      reversedNum = reversedNum * 10 + last_digit;
      input = input / 10;
    }
    if (reversedNum - x == 0) {
      return true;
    } else {
      return false;
    }
  }
}
