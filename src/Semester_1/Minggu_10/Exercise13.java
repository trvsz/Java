package Semester_1.Minggu_10;

public class Exercise13 {
    public static void main(String[] args) {
        int [] a1 = {10, 20, 30, 40, 50, 60};
        int [] a2 = {91, 92, 93, 94, 95, 96};
        copyRange(a1, a2, 0, 3, 2);
    }
    public static void copyRange(int[] a1, int[] a2, int i1, int i2, int length) {
        for (int i = i2; i < i2 + length; i++) {
            a2[i] = a1[i];
            i1++;
        }
    }
}
