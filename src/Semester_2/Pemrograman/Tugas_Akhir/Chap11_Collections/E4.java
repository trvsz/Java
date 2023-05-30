package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E4 {
    public static void main(String[] args) {
        Set <Integer> SET = new TreeSet<Integer>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka:");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Angka ke-" + (i + 1) + ":");
            SET.add(USER_INPUT.nextInt());
        }
        hasOdd(SET);
    }
    public static void hasOdd(Set<Integer> SET) {
        for (Integer i : SET) { // Pengulangan untuk mengambil nilai dari set
            if (i % 2 == 1) { // Jika nilai i ganjil
                System.out.println("Ada"); // Menampilkan "Ada"
                return; // Menghentikan program
            }
        }
        System.out.println("Tidak ada"); // Menampilkan "Tidak ada"
    }
}

/*
Output:
Jumlah angka:6
Angka ke-1:14
Angka ke-2:6
Angka ke-3:37
Angka ke-4:2
Angka ke-5:19
Angka ke-6:8
Ada
 */