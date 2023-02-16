package Semester_2.Pemrograman.Minggu_02;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisAllDigitsOdd {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Apakah Ganjil? \nMasukkan nilai: ");
        int i = ui.nextInt();
        System.out.printf("Hasil akhir adalah %s.", allDigitsOdd(i));
    }
    public static boolean allDigitsOdd (int i){
        boolean result = true;
        i = Math.abs(i);
        if (i == 0) {
            result = false;
        }
        
        while (i != 0) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                result = false;
            }
            i /= 10;
        }
        return result;
    }
}

/*
Apakah Ganjil? 
Masukkan nilai: 135319
Hasil akhir adalah true.
*/