import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Score extends Rectangle{

    static int GAME_WITDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;


    Score(int GAME_WITDTH, int GAME_HEIGHT){
        Score.GAME_WITDTH = GAME_WITDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;

    }

    public void draw (Graphics g){
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WITDTH/2, 0, GAME_WITDTH/2, GAME_HEIGHT);
    }
}
