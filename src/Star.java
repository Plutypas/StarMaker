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
        for (int i = 0; i < this.stopDistance; i++) {
            int x1 = (int) (this.distance*Math.cos((this.degrees*i)%360));
            int y1 = (int) (this.distance*Math.sin((this.degrees*i)%360));
            int x2 = (int) (this.distance*Math.cos((this.degrees*(this.sepDegree+i))%360));
            int y2 = (int) (this.distance*Math.sin((this.degrees*(this.sepDegree+i))%360));
            pointMap.add(new int[]{x1, y1, x2, y2});
        }
        return pointMap;
    }
}
