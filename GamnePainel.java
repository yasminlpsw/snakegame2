import javax.swing.*;
import java.awat.*;

public class GamePanel extends JPadenel {

    private final Board board = new Board();

    public GamePanel ()   {

        setPreferredSize(new Dimension(gameConstants.WIDTH,GameConstants.HEIGHT))     L
    }
@Override //Ela substitiu um método já existente na classe pai
JPanel
protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g draw(Graphics2D g2): void
board.draw(g)
    }
}
