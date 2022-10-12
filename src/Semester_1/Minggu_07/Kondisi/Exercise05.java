package Semester_1.Minggu_07.Kondisi;

public class Exercise05 {
    public static void main(String[] args) {
        int a = 7, b = 42;
        int smaller = minimum (a, b);
        if (smaller == a) {
            System.out.println("a is the smallest!");
        }
    }
    public static int minimum(int a, int b) { //returns which int is smaller
        int smaller;
        if (a < b) {
            smaller = a;
        } else {
            smaller = b;
        }
        return smaller;
    }
}
