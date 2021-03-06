package common;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public TreeNode(Integer[] y) {
    val = y[0];
    if(y[1] != null) left = new TreeNode(y[1]);
    if(y[2] != null) right = new TreeNode(y[2]);
    iterateNext(left, y, 3, 0);
    iterateNext(right, y, 3, 1);
  }

  public int[] treeHeights(){
    int leftHeight = 1;
    if (this.left != null) leftHeight+=treeHeight(left);
    int rightHeight = 1;
    if (this.right != null) rightHeight+=treeHeight(right);
    return new int[]{leftHeight, rightHeight};
  }

  private int treeHeight(TreeNode node) {
    if(node == null || (node.right == null && node.left == null )) {
      return 1;
    } else {
      return 1 + Math.max(treeHeight(node.left), treeHeight(node.right));
    }
  }

  private void iterateNext(TreeNode parent, Integer[] y, int level, int parentRange) {
    if (y.length > Math.pow(2, level-1)) {
      double rightIndex = Math.pow(2, level - 1) + 2 * parentRange;
      double leftIndex = rightIndex - 1;
      Integer leftValue = leftIndex < y.length ? y[(int) leftIndex] : null;
      if (leftValue != null) {
        TreeNode leftNode = new TreeNode(leftValue);
        parent.left = leftNode;
        iterateNext(leftNode, y, level + 1, 2 * parentRange);
      }
      Integer rightValue = rightIndex < y.length ? y[(int) rightIndex] : null;
      if (rightValue != null){
        TreeNode rightNode = new TreeNode(rightValue);
        parent.right = rightNode;
        iterateNext(rightNode, y, level + 1, 2 * parentRange+1);
      }
    }
  }

  public Integer[] toArray() {
    List<Integer> nodes = new ArrayList<>();
    nodes.add(val);
    ArrayList<TreeNode> next = new ArrayList<>();
    next.add(left);
    next.add(right);
    readNext(nodes, next);
    for (int i = nodes.size() - 1; i > 0 ; i--) {
      if (nodes.get(i) == null){
        nodes.remove(i);
      } else {
        break;
      }
    }
    return nodes.toArray(new Integer[0]);
  }

  private void readNext(List<Integer> nodes, ArrayList<TreeNode> here) {
    ArrayList<TreeNode> next = new ArrayList<>();
    int entityCount = 0;
    for (TreeNode node : here) {
      if (node == null) {
        nodes.add(null);
        next.add(null);
        next.add(null);
      } else {
        nodes.add(node.val);
        next.add(node.left);
        next.add(node.right);
        if (node.left != null) {
          entityCount++;
        }
        if (node.right != null) {
          entityCount++;
        }
      }
    }
    if (entityCount != 0) {
      readNext(nodes, next);
    }
  }

}
