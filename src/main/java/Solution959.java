import java.util.Arrays;

public class Solution959 {

  public int regionsBySlashes(String[] grid) {
    int N = grid.length;
    int size = N * grid[0].length() * 4;
    UnionFind unionFind = new UnionFind(size);
    for (int i = 0; i < N; i++) {
      String s = grid[i];
      char[] row = s.toCharArray();
      for (int j = 0; j < row.length; j++) {
        int index = 4 * (i * N + j);
        char c = row[j];
        switch (c) {
          case '/':
            unionFind.union(index, index + 3);
            unionFind.union(index + 1, index + 2);
            break;
          case '\\':
            unionFind.union(index, index + 1);
            unionFind.union(index + 2, index + 3);
            break;
          default:
            unionFind.union(index, index + 1);
            unionFind.union(index + 1, index + 2);
            unionFind.union(index + 2, index + 3);
            break;
        }
        // 右下的两格可以直接合并
        // 向右合并：1（当前）、3（左边列）
        if (j + 1 < N) {
          unionFind.union(index + 1, 4 * (i * N + j + 1) + 3);
        }
        // 向下合并：2（当前）、0（下一行）
        if (i + 1 < N) {
          unionFind.union(index + 2, 4 * ((i + 1) * N + j));
        }
      }
    }
    return unionFind.getCount();
  }

  private static class UnionFind {

    private final int[] parent;

    private int count;

    public int getCount() {
      return count;
    }

    // Initial UnionFind
    public UnionFind(int n) {
      this.count = n;
      this.parent = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
      }
    }

    // Find root parent
    public int find(int n) {
      while (n != parent[n]) {
        parent[n] = parent[parent[n]];
        n = parent[n];
      }
      return n;
    }

    public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);
      if (rootX == rootY) {
        return;
      }
      parent[rootX] = rootY;
      count--;
    }
  }
}
