package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah angka: ");
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            list.add(ui.nextInt());
        }
        System.out.println(list);
        reverse3(list);
        System.out.println(list);
    }
    public static void reverse3(ArrayList<Integer> list) {
        int size = list.size(); // Mengambil panjang list
        int end = size - (size % 3); // Mengambil nilai kelipatan 3 terdekat dari panjang list

        for (int i = 0; i < end; i += 3) { // Pengulangan untuk mengambil nilai dari list
            int temp = list.get(i); // Menyimpan nilai list ke dalam variabel temp
            list.set(i, list.get(i + 2)); // Mengubah nilai list
            list.set(i + 2, temp); // Mengubah nilai list
        }
    }
}

/*
Output:
Jumlah angka: 12
Masukkan angka ke-1: 3
Masukkan angka ke-2: 8
Masukkan angka ke-3: 19
Masukkan angka ke-4: 42
Masukkan angka ke-5: 7
Masukkan angka ke-6: 26
Masukkan angka ke-7: 19
Masukkan angka ke-8: -8
Masukkan angka ke-9: 193
Masukkan angka ke-10: 204
Masukkan angka ke-11: 6
Masukkan angka ke-12: -4
[3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4]
[19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204]
 */