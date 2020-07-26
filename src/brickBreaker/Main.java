package brickBreaker;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        GamePlay game = new GamePlay();

        obj.add(game);
        obj.setBounds(425,100,694,600);
        obj.setTitle("Breaker Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
