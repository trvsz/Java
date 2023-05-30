package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah angka list 1: ");
        int jumlah1 = ui.nextInt();
        for (int i = 0; i < jumlah1; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            list1.add(ui.nextInt());
        }
        System.out.print("Jumlah angka list 2: ");
        int jumlah2 = ui.nextInt();
        for (int i = 0; i < jumlah2; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            list2.add(ui.nextInt());
        }
        intersect(list1, list2);
    }
    public static void intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList <Integer> result = new ArrayList<>(); // Membuat list baru untuk menyimpan nilai yang sama
        int i = 0; 
        int j = 0;
        while (i < list1.size() && j < list2.size()) { // Pengulangan untuk mengambil nilai dari list
            if (list1.get(i).equals(list2.get(j))) { // Membandingkan nilai dari kedua list
                result.add(list1.get(i)); // Menambahkan nilai yang sama ke dalam list baru
                i++; // Menambahkan nilai i
                j++; // Menambahkan nilai j
            } else if (list1.get(i) < list2.get(j)) { // Membandingkan nilai dari kedua list
                i++; // Menambahkan nilai i
            } else { // Membandingkan nilai dari kedua list
                j++; // Menambahkan nilai j
            }
        }
        System.out.println(">> Intersect: " + result); // Menampilkan nilai list baru
    }
}

/*
Output:
Jumlah angka list 1: 10
Masukkan angka ke-1: 1
Masukkan angka ke-2: 4
Masukkan angka ke-3: 8
Masukkan angka ke-4: 9
Masukkan angka ke-5: 11
Masukkan angka ke-6: 15
Masukkan angka ke-7: 17
Masukkan angka ke-8: 28
Masukkan angka ke-9: 41
Masukkan angka ke-10: 59
Jumlah angka list 2: 11
Masukkan angka ke-1: 4
Masukkan angka ke-2: 7
Masukkan angka ke-3: 11
Masukkan angka ke-4: 17
Masukkan angka ke-5: 19
Masukkan angka ke-6: 20
Masukkan angka ke-7: 23
Masukkan angka ke-8: 28
Masukkan angka ke-9: 37
Masukkan angka ke-10: 59
Masukkan angka ke-11: 81
>> Intersect: [4, 11, 17, 28, 59]
 */