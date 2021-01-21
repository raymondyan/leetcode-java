import java.util.ArrayList;
import java.util.List;

public class Solution1584 {

  public int minCostConnectPoints(int[][] points) {
    Edge edge = new Edge(points);
    int[][] edges = edge.getEdges();
    List<Integer> selection = new ArrayList<>();
    List<Integer> pointList = new ArrayList<>();
    for (int i = 0; i < points.length; i++) {
      pointList.add(i);
    }
    selection.add(0);
    pointList.remove(0);
    int distance = 0;
    for (int i = 1; i < points.length; i++) {
      int min = Integer.MAX_VALUE;
      int dest = pointList.get(0);
      for (Integer m : selection) {
        for (int j = 0; j < pointList.size(); j++) {
          if (min > edges[m][pointList.get(j)] ) {
            min = edges[m][pointList.get(j)];
            dest = j;
          }
        }
      }
      distance += min;
      selection.add(pointList.get(dest));
      pointList.remove(dest);
    }
    return distance;
  }

  private static class Edge {

    public int[][] getEdges() {
      return edges;
    }

    int[][] edges;

    public Edge(int[][] points) {
      this.edges = calculate(points);
    }

    private int[][] calculate(int[][] points) {
      int pointsCount = points.length;
      int[][] edgeMatrix = new int[pointsCount][pointsCount];
      for (int i = 0; i < pointsCount; i++) {
        for (int j = i+1; j < edgeMatrix.length; j++) {
          edgeMatrix[i][j] = manhattanDistance(points, i, j);
          edgeMatrix[j][i] = edgeMatrix[i][j];
        }
      }
      return edgeMatrix;
    }

    private int manhattanDistance(int[][] points, int a, int b) {
      return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
  }
}
