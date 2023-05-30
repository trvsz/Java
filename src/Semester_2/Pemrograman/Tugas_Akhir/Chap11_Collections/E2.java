package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList <Integer> ();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah angka yang akan dimasukkan: ");
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            list.add(ui.nextInt());
        }
        System.out.print("Masukkan angka yang akan dihapus: ");
        int hapus = ui.nextInt();
        System.out.print("Masukkan batas awal: ");
        int awal = ui.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = ui.nextInt();
        removeInRange(list, hapus, awal, akhir);
        System.out.println(list);
    }
    public static void removeInRange(List<Integer> array, int element, int start, int end) {
        for (int i = start; i < end; i++) { // Pengulangan untuk menggeser nilai dalam list
            if (array.get(i) == element) { // Jika nilai list sama dengan element
                array.remove(i); // Menghapus nilai list
                i--; // Menggeser nilai i
                end--; // Menggeser nilai end
            }
        }
    }
}

/*
Output:
Jumlah angka yang akan dimasukkan: 17
Masukkan angka ke-1: 0
Masukkan angka ke-2: 0
Masukkan angka ke-3: 2
Masukkan angka ke-4: 0
Masukkan angka ke-5: 4
Masukkan angka ke-6: 0
Masukkan angka ke-7: 6
Masukkan angka ke-8: 0
Masukkan angka ke-9: 8
Masukkan angka ke-10: 0
Masukkan angka ke-11: 10
Masukkan angka ke-12: 0
Masukkan angka ke-13: 12
Masukkan angka ke-14: 0
Masukkan angka ke-15: 14
Masukkan angka ke-16: 0
Masukkan angka ke-17: 16
Masukkan angka yang akan dihapus: 0
Masukkan batas awal: 5
Masukkan batas akhir: 13
[0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16]
 */