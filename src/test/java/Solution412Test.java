import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution412Test {

  private final Solution412 solution412 = new Solution412();

  @Test
  void test() {
    List<String> res = solution412.fizzBuzz(15);
    assertEquals(Arrays.asList("1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"), res);
  }
}