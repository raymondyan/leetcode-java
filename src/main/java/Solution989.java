import java.util.ArrayList;
import java.util.List;

public class Solution989 {
  public List<Integer> addToArrayFormX(int[] A, int K) {
    long intRes =  transformIntegerListIntoInteger(A) + K;
    List<Integer> result = new ArrayList<>();
    if (intRes==0) result.add(0);
    while (intRes > 0) {
      long lastNumber = intRes % 10;
      result.add(0, (int) lastNumber);
      intRes = (intRes - lastNumber) / 10;
    }
    return result;
  }

  public long transformIntegerListIntoInteger(int[] A) {
    int lengthOfA = A.length;
    int digits = 0;
    long value = 0;
    while (lengthOfA > 0) {
      lengthOfA--;
      value += A[lengthOfA] * Math.pow(10, digits);
      digits ++;
    }
    return value;
  }

  public List<Integer> addToArrayForm(int[] A, int K) {
    ArrayList<Integer> res = new ArrayList<>();
    int lengthOfA = A.length;
    for (int i = lengthOfA - 1; i >= 0 ; i--) {
      int digitSum = A[i] + K%10;
      K/=10;
      if(digitSum>=10){
        K++;
        digitSum -= 10;
      }
      res.add(0,digitSum);
    }
    for (; K>0; K /= 10) {
      res.add(0,K%10);
    }
    return res;
  }

}
