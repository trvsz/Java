package Semester_1.Minggu_08.Boolean_Logic;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan 2 kalimat yang ingin diberi - .");

        System.out.print("Kalimat 1: ");
        String i = ui.nextLine();

        System.out.print("Kalimat 2: ");
        String j = ui.nextLine();
        
        String l ,s;
        if (i.length() > j.length()) {
            l = i;
            s = j;
        } else {
            l = j;
            s = i;
        }

        for (int k = 0; k < l.length(); k++) {
            if ("-".equals(l.charAt(k))) {
                if (k < s.length()) {
                    if (!"-".equals(k)) {
                        System.out.println(false);
                    }
                }
            } else {
                System.out.println(false);
            }
        }
        System.out.println(false);
    }
}
