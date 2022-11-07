package Semester_1.Minggu_10;

public class Exercise09 {
    public static void main(String[] args) {
        max(null);
    }
    public static int max(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}
