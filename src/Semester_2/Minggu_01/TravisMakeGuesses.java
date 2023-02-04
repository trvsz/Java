package Semester_2.Minggu_01;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 * 
 * Output telah dituliskan pada bagian bawah kode.
 */

import java.util.Random;

public class TravisMakeGuesses {
    public static void main(String[] args) {
        // Membuat data atau deklarasi
        int i = 0;
        Random r = new Random();
        int j;
        
        // Komputasi random
        do {
            j = r.nextInt(50) + 1;
            i++;
            System.out.println("guess = " + j);
        } while (j < 48);
        
        // Menampilkan berapa kali percobaan random
        System.out.println("total guesses = " + i);
    }
}

/*
CONTOH 1
guess = 9
guess = 11
guess = 38
guess = 19
guess = 48
total guesses = 5

CONTOH 2
guess = 44
guess = 47
guess = 44
guess = 38
guess = 41
guess = 44
guess = 1
guess = 10
guess = 35
guess = 50
total guesses = 10
*/