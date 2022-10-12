package Semester_1.Minggu_07.Kondisi;

import java.util.*;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan harga serta rating film.");

        System.out.print("Harga Film: $");
        double harga = ui.nextDouble();

        System.out.print("Rating Film (1-5): ");
        int rat = ui.nextInt();

        if (harga < 5.00 || harga < 12.00 && rat == 5) {
            System.out.println("Tertarik.");
        } else if (harga >= 12.00 && rat == 5 || 5.00 <= harga && harga <= 11.99 && 2 <= rat && rat <= 4) {
            System.out.println("Sedikit tertarik.");
        }
        else {
            System.out.println("Tidak tertarik");
        }
    }
}
