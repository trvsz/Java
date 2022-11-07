package Semester_1.Minggu_10;

public class Exercise11 {
    public static void main(String[] args) {
        int [] a = {1, 3, 6, 7, 12};
        if (a.length < 2) {
            System.out.println(0);
        }
        int m = a[1] - a[0];
        for (int i = 0; i <= a.length - 2; i++) {
            if (a[i + 1] - a[i] < m) {
                m = a[i + 1] - a[i];
            }
        }
    }
}
