package Semester_1.Minggu_07.Kondisi;

import java.util.*;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan umur anda.");

        System.out.print("Umur anda adalah ");
        int umur = ui.nextInt();

        if (umur >= 17) {
            System.out.println("Anda boleh mengenderai kendaraan bermotor.");
        } else {
            System.out.println("Anda belum memiliki umur yang cukup untuk mengendarainya.");
        }
    }
}
