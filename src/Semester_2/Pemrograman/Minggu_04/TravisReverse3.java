package Semester_2.Pemrograman.Minggu_04;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class TravisReverse3 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Masukkan jumlah data: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            list.add(ui.nextInt());
        }
        System.out.println("Sebelum ditukar: " + list);
        System.out.print("Setelah ditukar: ");
        reverse3(list);
    }
    public static void reverse3(ArrayList<Integer> list) { 
        for (int i = 0; i < list.size() - 2; i+=3) { 
            int temp1 = list.get(i);
            int temp2 = list.get(i+1);
            int temp3 = list.get(i+2);
            list.set(i, temp3);
            list.set(i + 1, temp2);
            list.set(i + 2, temp1);
        }
        System.out.println(list);
    }
}
/*
Masukkan jumlah data: 12
Masukkan data ke-1: 3
Masukkan data ke-2: 8
Masukkan data ke-3: 19
Masukkan data ke-4: 42
Masukkan data ke-5: 7
Masukkan data ke-6: 26
Masukkan data ke-7: 19
Masukkan data ke-8: -8
Masukkan data ke-9: 193
Masukkan data ke-10: 204
Masukkan data ke-11: 6
Masukkan data ke-12: -4
Sebelum ditukar: [3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4]     
Setelah ditukar: [19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204] 
*/