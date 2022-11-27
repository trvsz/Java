package Semester_1.Minggu_11;

// Exercise 8, 9, 10, 12

public class Exercise08{
}

class Point {
    private int x;
    private int y;
    
    // Exercise 8 BJP4 Exercise 8.2: flipPoint
    public int quadrant () {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Exercise 9 BJP4 Exercise 8.2: flipPoint
    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    // Exercise 10 BJP4 Self-Check 8.14: toStringPoint
    public String toString() {
        return "java.awt.Point[x=" + this.x + ",y=" + this.y + "]";
    }

    // Exercise 12 BJP4 Exercise 8.3: manhattanDistancePoint
    public int manhattanDistance(Point p) {
        int a = this.x - p.x;
        int b = this.y - p.y;
        return Math.abs(a) + Math.abs(b);
    }
}
