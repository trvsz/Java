package Semester_1.Minggu_11;

import java.awt.*;

public class Exercise03 {
    int x;                                   // Each Point object has
    int y;                                   // an int x and y inside.

    public void draw(Graphics g) {           // draws this point
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    public void translate(int dx, int dy) {  // Shifts this point's x/y
        x = x + dx;                          // by the given amounts.
        y = y + dy;
    }

    public double distanceFromOrigin() {         // Returns this point's
        double dist = Math.sqrt(x * x + y * y);  // distance from (0, 0).
        return dist;
    }
}
