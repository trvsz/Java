package Semester_1.Minggu_10;

import java.util.*;
import java.io.*;

public class Exercise13 {
    public static void main(String[] args) {
        int [] a1 = {10, 20, 30, 40, 50, 60};
        int [] a2 = {91, 92, 93, 94, 95, 96};
        System.out.println(Arrays.toString(copyRange(a1, a2, 0, 3, 2)));
    }
    public static int[] copyRange(int[] a1, int[] a2, int i1, int i2, int i3) {
        for (int i = 0; i < i3; i++) {
            a2[i2 + i] = a1[i1 + i];
        }
        return a2;
    }
}
