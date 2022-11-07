package Semester_1.Minggu_10;

public class Exercise12 {
    public static void main(String[] args) {
        int [] a = {6, 2, 9, 11, 3};
        if (a.length == 0) {
            System.out.println(0.0);
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count * 100.0 / a.length);
    }
}
