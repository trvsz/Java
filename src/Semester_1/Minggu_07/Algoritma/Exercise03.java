package Semester_1.Minggu_07.Algoritma;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan kata yang akan direpetisi kemudian berapa kali repetisi");

        System.out.print("Kata = ");
        String word = ui.nextLine();

        System.out.print("Repetisi = ");
        int rep = ui.nextInt();

        if (rep <= 0) {
            System.out.println();
        } else {
            String kata = "";
            for (int i = 0; i < rep; i++) {
                kata+=word;
                System.out.print(word);
            }
        }
    }
}
