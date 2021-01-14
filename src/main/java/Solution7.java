import java.util.stream.IntStream;

public class Solution7 {

  public int reverse2(int x) {
    if (x == 0) {
      return 0;
    }
    String s = String.valueOf(Math.abs(x));
    StringBuilder r = new StringBuilder();
    IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).forEach(i -> {
      char c = s.charAt(i);
      if (i != s.length() - 1 || c != '0') {
        r.append(c);
      }
    });
    try {
      return Integer.parseInt(r.toString()) * (x > 0 ? 1 : -1);
    } catch (Exception e) {
      return 0;
    }
  }

  public int reverse(int x){
    if(x==0) return 0;
    int sign = x / Math.abs(x);
    x=Math.abs(x);
    int length = String.valueOf(x).length();
    int i;
    long res=0;
    while (x>0){
      i = x % 10;
      res += i * Math.pow(10,length-1);
      length--;
      x = (x - i)/10;
    }
    try {
      return Integer.parseInt(String.valueOf(res*sign));
    } catch (Exception e) {
      return 0;
    }
  }

  public int reverse3(int x) {
    long n = 0;
    while (x != 0) {
      n = n*10 + x%10;
      x = x/10;
    }
    return (int)n==n? (int)n:0;
  }
}
