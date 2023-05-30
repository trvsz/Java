package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E7 {
    public static void main(String[] args) {
        Queue <Integer> QUEUE = new LinkedList <Integer> ();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka yang akan dimasukkan: ");
        int JUMLAH_ANGKA = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_ANGKA; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            QUEUE.add(ANGKA);
        }
        interLeave(QUEUE);
        System.out.println(QUEUE);
    }
    public static void interLeave (Queue <Integer> QUEUE) {
        Stack <Integer> STACK = new Stack <Integer> (); // inisialisasi stack
        int SIZE = QUEUE.size(); // inisialisasi panjang queue
        for (int i = 0; i < SIZE / 2; i++) { // iterasi sebanyak panjang queue dibagi 2
            STACK.push(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke stack
        }
        while (!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            QUEUE.add(STACK.pop()); // mengambil nilai dari stack dan menambahkan ke queue
        }
        for (int i = 0; i < SIZE / 2; i++) { // iterasi sebanyak panjang queue dibagi 2
            QUEUE.add(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke queue
        }
        for (int i = 0; i < SIZE / 2; i++) { // iterasi sebanyak panjang queue dibagi 2
            STACK.push(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke stack
        }
        while (!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            QUEUE.add(STACK.pop()); // mengambil nilai dari stack dan menambahkan ke queue
            QUEUE.add(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke queue
        }
        if (QUEUE.size() % 2 == 1) { // jika panjang queue habis dibagi 2
            throw new IllegalArgumentException(); // mengembalikan nilai error
        }
    }
}

/*
Output:
Jumlah angka yang akan dimasukkan: 8
Masukkan angka ke-1: 2
Masukkan angka ke-2: 8
Masukkan angka ke-3: -5
Masukkan angka ke-4: 19
Masukkan angka ke-5: 7
Masukkan angka ke-6: 3
Masukkan angka ke-7: 24
Masukkan angka ke-8: 42
[2, 7, 8, 3, -5, 24, 19, 42]
 */
