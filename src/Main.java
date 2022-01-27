import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Star pentagram = new Star (2, 50, 5, 72);
        ArrayList<int[]> points = pentagram.generateRelativePointMap();
        Frame display= new Frame();
        display.updatePointMap(pentagram.generateRelativePointMap());
    }
}
