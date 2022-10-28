package Semester_1.Minggu_08.While_Loops;

import java.util.*;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int i = ui.nextInt();
        
        System.out.print("1");
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                System.out.print(" and " + j);
            }
        }
        System.out.println();
    }
}
