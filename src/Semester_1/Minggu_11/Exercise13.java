package Semester_1.Minggu_11;

// TimeSpan

public class Exercise13 {
    int h;
    int m;

    public Exercise13(int h, int m) {
        this.h = h;
        this.m = m;
    }
    public int getH() {
        return h;
    }
    public int getM() {
        return m;
    }
    public void add(int h, int m) {
        this.h = this.h + h + ((this.m + m) / 60);
        this.m = (this.m + m) % 60;
    }
    public void add (Exercise13 a) {
        this.h = this.h + a.h + ((this.m + m) / 60);
        this.m = (this.m + m) % 60;
    }
    public double getTH() {
        return (double) h + m / 60.0;
    }
    public String toString() {
        return h + "h" + m + "m";
    }
}
