package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E5 {
    public static void main(String[] args) {
        Set <Integer> SET_ODD = new TreeSet<Integer>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka:");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Angka ke-" + (i + 1) + ":");
            SET_ODD.add(USER_INPUT.nextInt());
        }
        Set <Integer> SET_EVEN = removeEvens(SET_ODD);
        System.out.println("Data SET_ODD: " + SET_ODD);
        System.out.println("Data SET_EVEN: " + SET_EVEN);
    }
    public static Set <Integer> removeEvens(Set <Integer> SET_ODD) {
        Set <Integer> SET_EVEN = new TreeSet<Integer>(); // Membuat set baru
        for (Integer num : SET_ODD) { // Pengulangan untuk mengambil nilai dari set
            if (num % 2 == 0) { // Jika nilai num genap
                SET_EVEN.add(num); // Menambahkan nilai num ke dalam set
            }
        }
        SET_ODD.removeAll(SET_EVEN); // Menghapus nilai SET_EVEN dari SET_ODD
        return SET_EVEN; // Mengembalikan nilai SET_EVEN
    }
}

/*
Output:
Jumlah angka:8
Angka ke-1:0
Angka ke-2:17
Angka ke-3:16
Angka ke-4:7
Angka ke-5:10
Angka ke-6:12
Angka ke-7:13
Angka ke-8:14
Data SET_ODD: [7, 13, 17]
Data SET_EVEN: [0, 10, 12, 14, 16]
 */