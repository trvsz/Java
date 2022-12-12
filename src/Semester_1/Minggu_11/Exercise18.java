package Semester_1.Minggu_11;

// BJP4 Exercise 8.21: unionRectangle

public class Exercise18 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Exercise18 (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public String toString() {
        return "{(" + x +"," + y + "), " + width + "x" + height + "}";
    }
    
    // Exercise 18
    public Exercise18 union(Exercise18 r) {
        int xu = Math.min(r.x, x);
        int yu = Math.min(r.y, y);
        int wu = Math.max(r.x + r.width, x + width) - xu;
        int hu = Math.max(r.y + r.height, y + height) - yu;
        Exercise18 union = new Exercise18(xu, yu, wu, hu);
        return union;
    }
    
    //Exercise 19
    /*
     * public boolean contains(Point a) {
        if((a.x >= x && a.x <= (x + width)) && (a.y >= y && a.y <= (y + height))) {
            return true;
        } else {
            return false;
        }
    }
     */
}
