import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution119Test {
  private final Solution119 solution119 = new Solution119();

  @Test
  void test1() {
    List<Integer> res = solution119.getRow(3);
    Assertions.assertEquals(Arrays.asList(1,3,3,1), res);
  }

  @Test
  void test2() {
    List<Integer> res = solution119.getRow(33);
    Assertions.assertEquals(Arrays.asList(1,33,528,5456,40920,237336,1107568,4272048,13884156,38567100,92561040,193536720,354817320,573166440,818809200,1037158320,1166803110,1166803110,1037158320,818809200,573166440,354817320,193536720,92561040,38567100,13884156,4272048,1107568,237336,40920,5456,528,33,1), res);
  }

  @Test
  void test3() {
    List<Integer> res = solution119.getRow(4);
    Assertions.assertEquals(Arrays.asList(1,4,6,4,1), res);
  }
}