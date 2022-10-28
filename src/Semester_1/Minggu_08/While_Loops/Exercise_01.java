package Semester_1.Minggu_08.While_Loops;

public class Exercise_01 {
    public static void main(String[] args) {
        int x = 1;
        System.out.print(x);
        while (x < 100) {
        x = x + x;
        System.out.print(", " + x);
        }
    }
}

// How many times does the code in the whhile loop execute?
// 7

// What output is produced by the overall code?
// 1, 2, 4, 8, 16, 32, 64, 128