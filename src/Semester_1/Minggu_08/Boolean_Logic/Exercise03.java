package Semester_1.Minggu_08.Boolean_Logic;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");

        System.out.print("x = ");
        int x = ui.nextInt();

        System.out.print("y = ");
        int y = ui.nextInt();

        System.out.print("z = ");
        int z = ui.nextInt();

        if (x == y && y == z && x == z) {
            System.out.println(true);
        } else {
            int smol = Math.min(x, Math.min(y, z));
            int big = Math.max(x, Math.max(y, z));
            double mid = (smol + big) / 2.0;
            if (mid != smol) {
                if (mid == x || mid == y || mid == z) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
    }
}
