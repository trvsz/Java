package Semester_1.Minggu_12; //dapat dihapus jika menganggu kode

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisLuas {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai nilai:");

        System.out.print("a = ");
        int a = ui.nextInt();

        System.out.print("b = ");
        int b = ui.nextInt();

        System.out.println(luas(a, b));
    }
    public static int luas(int a, int b) {
        return a * b;
    }
}
