package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

import java.util.*;

public class E9 {
    public static void main(String[] args) {
        Set <String> KATA = new HashSet<>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah kata yang ingin dimasukkan: ");
        int JUMLAH_KATA = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_KATA; i++) {
            System.out.print("[ " + i + " ] Kata: ");
            String DATA = USER_INPUT.next();
            KATA.add(DATA);
        }
        Map <Integer, Set<String>> HASIL = split(KATA);
        System.out.println("Hasilnya adalah: " + HASIL);
    }
    public static Map <Integer, Set<String>> split (Set <String> INPUT) {
        Map <Integer, Set<String>> RESULT_MAP = new TreeMap<>(); // Membuat map baru
        for (String str : INPUT) { // Pengulangan untuk mengambil nilai dari set
            int LENGTH = str.length(); // Mengambil panjang nilai str
            if (!RESULT_MAP.containsKey(LENGTH)) { // Jika map tidak mengandung key LENGTH
                RESULT_MAP.put(LENGTH, new HashSet<>()); // Menambahkan key LENGTH ke dalam map
            }
            RESULT_MAP.get(LENGTH).add(str); // Menambahkan nilai str ke dalam map
        }
        return RESULT_MAP; // Mengembalikan nilai RESULT_MAP
    }
}

/*
Output:
Jumlah kata yang ingin dimasukkan:8
[ 0 ] Kata: to
[ 1 ] Kata: be
[ 2 ] Kata: or
[ 3 ] Kata: not
[ 4 ] Kata: that
[ 5 ] Kata: is
[ 6 ] Kata: the
[ 7 ] Kata: question
Hasilnya adalah: {2=[be, or, is, to], 3=[the, not], 4=[that], 8=[question]}
 */