package Semester_1.Minggu_07.Kondisi;

import java.util.*;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan umur anda.");

        System.out.print("Umur anda = ");
        int umur = ui.nextInt();

        if (umur >= 17) {
            System.out.println("Anda bisa mendapatkan SIM.");
            if (umur >= 18) {
                System.out.println("Anda bisa membeli tiket dengan rating R.");
            }
            if (umur >= 21) {
                System.out.println("Anda bisa membeli alkohol secara legal.");
            }
        }
    }
}
