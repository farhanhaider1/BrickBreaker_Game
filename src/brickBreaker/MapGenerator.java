package brickBreaker;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(int row, int column){
        map = new int[row][column];
        fillArray();
    }

    private void fillArray() {
        for(int i = 0;i<map.length;i++){
            for (int j = 0; j< map[0].length;j++){
                map[i][j]=1;
            }
        }
    }
}
