public class Solution13 {
  public int romanToInt(String s) {
    char[] chars = s.toCharArray();
    int res = 0;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c == 'M') {
        res += 1000;
      } else if (c == 'D') {
        res += 500;
      } else if (c == 'C') {
        if (chars.length > i + 1 && chars[i + 1] == 'D') {
          res += 400;
          i++;
        } else if (chars.length > i + 1 && chars[i + 1] == 'M') {
          res += 900;
          i++;
        } else {
          res += 100;
        }
      } else if (c == 'L') {
        res += 50;
      } else if (c == 'X') {
        if (chars.length > i + 1 && chars[i + 1] == 'L') {
          res += 40;
          i++;
        } else if (chars.length > i + 1 && chars[i + 1] == 'C') {
          res += 90;
          i++;
        } else {
          res += 10;
        }
      } else if (c == 'V') {
        res += 5;
      } else if (c == 'I') {
        if (chars.length > i + 1 && chars[i + 1] == 'V') {
          res += 4;
          i++;
        } else if (chars.length > i + 1 && chars[i + 1] == 'X') {
          res += 9;
          i++;
        } else {
          res += 1;
        }
      }

    }
    return res;
  }
}
