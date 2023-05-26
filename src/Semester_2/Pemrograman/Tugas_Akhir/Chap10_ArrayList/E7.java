package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;
import java.util.ArrayList;

public class E7 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah kata: ");
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan kata ke-" + (i + 1) + ": ");
            list.add(ui.next());
        }
        switchPairs(list);
        System.out.println(list);
    }
    public static void switchPairs(ArrayList<String> list) {
        int size = list.size();
        int end = size - (size % 2);

        for (int i = 0; i < end; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}

/*
Output:
Jumlah kata: 7
Masukkan kata ke-1: to
Masukkan kata ke-2: be
Masukkan kata ke-3: or
Masukkan kata ke-4: not
Masukkan kata ke-5: to
Masukkan kata ke-6: be
Masukkan kata ke-7: hamlet
[be, to, not, or, be, to, hamlet]
 */