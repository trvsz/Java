package Semester_1.Minggu_10;

import java.util.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        int[] a1 = {11, 42, -5, 27, 0, 89};
        int[] a2 = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(swapAll(a1, a2)));
    }
    public static int[] swapAll(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length; i++) {
            int temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
        }
        return a1; //untuk practice it, baris ini dihapus.
    }
}
