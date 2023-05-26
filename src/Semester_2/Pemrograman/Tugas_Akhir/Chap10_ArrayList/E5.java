package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Berapa banyak kata yang ingin anda masukkan? ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan kata ke-" + (i + 1) + ": ");
            words.add(ui.next());
        }
        System.out.print("Akronim dari kata-kata yang anda masukkan adalah: ");
        acronymFor(words);
    }
    public static void acronymFor(ArrayList<String> words) {
        for (String word : words) {
            word = word.toUpperCase();
            System.out.print(word.charAt(0));
        }
    }
}

/*
Output:
Berapa banyak kata yang ingin anda masukkan? 3
Masukkan kata ke-1: laughing
Masukkan kata ke-2: out
Masukkan kata ke-3: loud
Akronim dari kata-kata yang anda masukkan adalah: LOL
 */
