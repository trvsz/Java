package Semester_1.Minggu_16;

public class triangle {
    public static void main(String[] args) {
        triangle(5);
    }
    public static void triangle(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= (value - i); j++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
