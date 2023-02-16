package Semester_2.Pemrograman.Minggu_02;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisBefore {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan urutan bulan kemudian tanggal lalu ulangi.");
        
        System.out.print("Bulan 1 = ");
        int i = ui.nextInt();

        System.out.print("Tanggal 1 = ");
        int j = ui.nextInt();

        System.out.print("Bulan 2 = ");
        int k = ui.nextInt();

        System.out.print("Tanggal 2 = ");
        int l = ui.nextInt();

        System.out.printf("Pernyataan tanggal dan bulan pertama sebelum tanggal dan bulan kedua adalah %s.", before(i, j, k, l));
    }
    public static Boolean before(int i, int j, int k, int l) {
        if (i < k) {
            if (j < l) {
                return true;
            } else if (j > l) {
                return false;
            }
        } else if (i > k || i == k) {
            return false;
        }
        return false;
    }
}

/*
Masukkan urutan bulan kemudian tanggal lalu ulangi.
Bulan 1 = 1
Tanggal 1 = 2
Bulan 2 = 3
Tanggal 2 = 4
Pernyataan tanggal dan bulan pertama sebelum tanggal dan bulan kedua adalah true.
*/