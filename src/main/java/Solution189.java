import java.util.LinkedList;
import java.util.Queue;

public class Solution189 {
  public void rotate(int[] nums, int k) {
    Queue<Integer> queue = new LinkedList<>();
    int l = nums.length;
    int realK = k%l;
    for (int i = 0; i < l; i++) {
      queue.offer(nums[i]);
      if (i<realK) {
        nums[i] = nums[(i + l)- realK];
      } else {
        if(!queue.isEmpty())  nums[i] = queue.poll();
      }
    }
  }

  public void rotate2(int[] nums, int k) {
    int l = nums.length;
    int realK = k% l;
    inverseArray(nums, 0, l -1);
    inverseArray(nums, 0, realK-1);
    inverseArray(nums, realK, l -1);
  }

  public void inverseArray(int[] nums, int start, int end){
    while (start < end){
      int cache = nums[start];
      nums[start] = nums[end];
      nums[end] = cache;
      start++;
      end--;
    }
  }
}
