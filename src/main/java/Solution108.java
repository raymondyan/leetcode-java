import common.TreeNode;

public class Solution108 {
  public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length == 0)
      return null;
    int mid = (nums.length - 1) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = sortedArrayToBST(0, mid - 1, nums, root);
    root.right = sortedArrayToBST(mid + 1, nums.length - 1, nums, root);
    return root;
  }

  private TreeNode sortedArrayToBST(int start, int end, int[] nums, TreeNode root) {
    if(start > end) {
      return null;
    }
    int mid = start+(end - start)/2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = sortedArrayToBST(start,mid-1,nums, node);
    node.right = sortedArrayToBST(mid+1,end,nums, node);
    return node;
  }
}