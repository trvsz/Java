package Semester_1.Minggu_08.Boolean_Logic;

import java.util.Scanner;

public class Exercise04 {
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

        if (i < k) {
            if (j < l) {
                System.out.println(true);
            } else if (j > l) {
                System.out.println(false);
            }
        } else if (i > k || i == k){
            System.out.println(false);
        }
    }
}
