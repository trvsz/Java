package Semester_2.Pemrograman.Minggu_04;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class TravisSwitchPairs {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Masukkan jumlah kata: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan kata ke-" + (i+1) + ": ");
            list.add(ui.next());
        }
        System.out.println("Sebelum ditukar: " + list);
        System.out.print("Setelah ditukar: ");
        switchPairs(list);
    }
    public static void switchPairs(ArrayList<String> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i+=2) {
            String temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        System.out.println(list);
    }
}

/*
Masukkan jumlah kata: 5
Masukkan kata ke-1: satu
Masukkan kata ke-2: dua
Masukkan kata ke-3: tiga
Masukkan kata ke-4: empat
Masukkan kata ke-5: lima
Sebelum ditukar: [satu, dua, tiga, empat, lima]
Setelah ditukar: [dua, satu, empat, tiga, lima]
*/