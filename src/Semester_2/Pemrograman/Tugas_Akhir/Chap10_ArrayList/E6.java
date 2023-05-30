package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zsua Zuve Saputra
 * 22537141013
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah kata: ");
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan kata ke-" + (i + 1) + ": ");
            list.add(ui.next());
        }
        addStars(list);
        System.out.println(list);
    }
    public static void addStars(ArrayList<String> list) {
        for (int i = 1; i <= list.size(); i += 2) { // Pengulangan untuk mengambil nilai dari list
            list.add(i, "*"); // Menambahkan nilai * ke dalam list
        }
    }
}

/*
Output:
Jumlah kata: 4
Masukkan kata ke-1: the 
Masukkan kata ke-2: quick
Masukkan kata ke-3: brown
Masukkan kata ke-4: fox
[the, *, quick, *, brown, *, fox, *]
 */
