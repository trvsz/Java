package Semester_2.Pemrograman.Minggu_02;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisHasMidpoint {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Apakah Mempunyai Nilai Tengah? Masukkan nilai: ");

        System.out.print("x = ");
        int x = ui.nextInt();

        System.out.print("y = ");
        int y = ui.nextInt();

        System.out.print("z = ");
        int z = ui.nextInt();

        System.out.printf("Nilai diatas akan menghasilkan return %s.", hasMidpoint(x, y, z));
    }
    public static Boolean hasMidpoint(int x, int y, int z) {
        if (x == y && y == z && x == z) {
            return true;
        } else {
            int smol = Math.min(x, Math.min(y, z));
            int big = Math.max(x, Math.max(y, z));
            double mid = (smol + big) / 2.0;
            if (mid != smol) {
                if (mid == x || mid == y || mid == z) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

/*
Apakah Mempunyai Nilai Tengah? Masukkan nilai:
x = 1
y = 2
z = 3
Nilai diatas akan menghasilkan return true.
*/