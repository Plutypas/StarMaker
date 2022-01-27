import java.util.ArrayList;

public class Star {
    private int sepDegree;
    private int distance;
    private int stopDistance;
    private int degrees;

    public Star(int separation, int distance, int maxLines, int degrees) {
        this.sepDegree=separation;
        this.distance=distance;
        this.stopDistance=maxLines;
        this.degrees=degrees;
    }

    public ArrayList<int[]> generateRelativePointMap() {
        ArrayList<int[]> pointMap = new ArrayList<>();
        int lastDegree=0;
        for (int i = 0; i < this.stopDistance; i++) {
            int x1 = (int) (this.distance*Math.cos(Math.toRadians((lastDegree)%360)));
            int y1 = (int) (this.distance*Math.sin(Math.toRadians((lastDegree)%360)));
            int x2 = (int) (this.distance*Math.cos(Math.toRadians((lastDegree+(this.degrees*this.sepDegree))%360)));
            int y2 = (int) (this.distance*Math.sin(Math.toRadians((lastDegree+(this.degrees*this.sepDegree))%360)));
            lastDegree=((this.degrees*this.sepDegree)+lastDegree)%360;
            pointMap.add(new int[]{x1, y1, x2, y2});
        }
        return pointMap;
    }
}
