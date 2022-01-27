import javax.swing.*;
import java.util.ArrayList;

public class Frame extends JFrame {

    private Panel panel;
    private ArrayList<int[]> pointMap;

    public Frame() {
        this.setSize(800, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.panel=new Panel();
        this.pointMap=new ArrayList<>();
        this.add(this.panel);
        this.setVisible(true);
    }

    public void updatePointMap(ArrayList<int[]> pointMap) {
        this.pointMap.addAll(pointMap);
        this.panel.updatePoints(this.pointMap);
        this.panel.revalidate();
        this.panel.repaint();
    }
}
