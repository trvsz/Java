package Semester_1.Minggu_11;

public class Exercise15 {
    int x;
    int y;

    public Exercise15(int initX, int initY) {
        x = initX;
        y = initY;
    }
    public double distanceFromOrigin() {
        double dist = Math.sqrt(x * x + y * y);
        return dist;
    }
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }
}
