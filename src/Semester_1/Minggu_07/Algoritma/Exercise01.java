package Semester_1.Minggu_07.Algoritma;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan angka low dan high.");

        System.out.print("low = ");
        int low = ui.nextInt();

        System.out.print("high = ");
        int high = ui.nextInt();
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
