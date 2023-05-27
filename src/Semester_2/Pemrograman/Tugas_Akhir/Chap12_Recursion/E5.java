package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String WORD = USER_INPUT.nextLine();
        System.out.print("Masukkan START: ");
        int START = USER_INPUT.nextInt();
        System.out.print("Masukkan END: ");
        int END = USER_INPUT.nextInt();
        System.out.println("Hasil: " + substring(WORD, START, END));
    }
    public static String substring (String WORD, int START, int END) {
        if (START < 0 || END < 0 || START > END || END > WORD.length()) { // length() hanya untuk syarat agar tidak error
            throw new IllegalArgumentException();
        } else if (START == END) {
            return "";
        } else {
            return WORD.substring(START, END);
        }
    }
}

/*
Output:
Masukkan kata: hello
Masukkan START: 0
Masukkan END: 2
Hasil: he

Masukkan kata: hamburger
Masukkan START: 4
Masukkan END: 8
Hasil: urge

Masukkan kata: howdy
Masukkan START: 3
Masukkan END: 3
Hasil:
 */