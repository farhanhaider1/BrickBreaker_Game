package brickBreaker;

import java.awt.*;

public class MapGenerator {
    public int bricks[][];
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(int row, int col){
        fillArray(row,col);

        brickHeight = 150/row;
        brickWidth = 540/col;


    }

    private void fillArray(int row,int col) {
        bricks = new int[row][col];
        for(int i = 0; i< bricks.length; i++){
            for (int j = 0; j< bricks[0].length; j++){
                bricks[i][j]=1;
            }
        }
    }

    public void drawBricks(Graphics2D g){

        for(int i = 0; i< bricks.length; i++) {
            for (int j = 0; j < bricks[0].length; j++) {
                if(bricks[i][j] > 0){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80,i*brickHeight + 50,
                            brickWidth,brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.RED);
                    g.drawRect(j * brickWidth + 80,i*brickHeight + 50,
                            brickWidth,brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value,int row,int col){
        bricks[row][col] = value;
    }
}
