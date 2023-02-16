package Semester_2.Pemrograman.Minggu_03;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisAddStars {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner ui = new Scanner(System.in);

        System.out.print("Jumlah kata yang ingin ditambahkan: ");
        int n = ui.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.printf("[+] Masukkan kata ke-%d: ", i);
            list.add(ui.next());
        }
        
        addStars(list);
    }
    public static void addStars(ArrayList<String> list) {
        for (int i = 1; i <= list.size(); i += 2) {
            list.add(i, "*");
        }
        System.out.println("Hasilnya adalah " + list);
    }
}

/*
Jumlah kata yang ingin ditambahkan: 3
[+] Masukkan kata ke-0: hai
[+] Masukkan kata ke-1: kamu
[+] Masukkan kata ke-2: dia
Hasilnya adalah [hai, *, kamu, *, dia, *]
*/