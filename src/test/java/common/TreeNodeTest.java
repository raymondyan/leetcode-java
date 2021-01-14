package common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

  @Test
  void testOfBaseConstructor() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(2);
    treeNode.right = new TreeNode(3);
    treeNode.right.right = new TreeNode(4);
    Integer[] integers = treeNode.toArray();
    assertArrayEquals(new Integer[]{1,2,3,null,null,null,4}, integers);
    Math.pow(16.0, 0.5);
  }

  @Test
  void name() {
    TreeNode treeNode = new TreeNode(new Integer[]{3,9,20,null,null,15,7});
    assertArrayEquals(new Integer[]{3,9,20,null,null,15,7}, treeNode.toArray());
  }
}