import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {
    private ArrayList<int[]> pointMap;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        g2D.setStroke(new BasicStroke(1));
        for (int[] line:this.pointMap) {
            g2D.drawLine(line[0]+400, line[1]+200, line[2]+400, line[3]+200);
        }
    }

    public void updatePoints(ArrayList<int[]> pointMap) {
        this.pointMap=pointMap;
    }
}
