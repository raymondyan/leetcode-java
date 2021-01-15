public class Solution547 {
  public int findCircleNum(int[][] isConnected) {
    int cityAmount = isConnected.length;
    int[] cityPool = new int[cityAmount];
    int province = 0;
    for (int i = 0; i < cityAmount; i++) {
      if(cityPool[i] != 1){
        cityPool[i] = 1;
        cityPool = cityConnected(i, isConnected, cityPool);
        province ++;
      }
    }
    return province;
  }

  private int[] cityConnected(int me, int[][] isConnected, int[] cityPool){
    for (int i = me+1; i < isConnected.length; i++) {
      if (cityPool[i] != 1 && isConnected[me][i] == 1){
        cityPool[i] = 1;
        cityPool = cityConnected(i, isConnected, cityPool);
      }
    }
    return cityPool;
  }
}
