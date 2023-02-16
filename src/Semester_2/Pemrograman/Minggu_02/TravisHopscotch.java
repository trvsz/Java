package Semester_2.Pemrograman.Minggu_02;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisHopscotch {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Masukkan Nilai Pola: ");
        int x = ui.nextInt();
        System.out.println("Polanya adalah ");
        hopscotch(x);
    }
    public static void hopscotch(int x) {
        int a = 1;
        int total = 3 * x + 1;

        while (a < total) {
            if ((a - 1) % 3 == 0) {
                System.out.println("   " + a);
                a++;
            } else {
                System.out.println(a + "     " + (a + 1));
                a += 2;
            }
        }
        System.out.println("   " + a);
    }
}

/*
Masukkan Nilai Pola: 3
Polanya adalah 
   1
2     3
   4
5     6
   7
8     9
   10
*/