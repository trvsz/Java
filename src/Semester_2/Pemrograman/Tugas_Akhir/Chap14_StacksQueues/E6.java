package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E6 {
    public static void main(String[] args) {
        Queue <Integer> QUEUE = new LinkedList<>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka: ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            QUEUE.add(ANGKA);
        }
        System.out.println("Sebelum: " + QUEUE);
        reorder(QUEUE);
        System.out.println("Sesudah: " + QUEUE);
    }
    public static void reorder (Queue <Integer> QUEUE) { 
        Stack <Integer> STACK = new Stack<>(); // inisialisasi stack
        int SIZE = QUEUE.size(); // inisialisasi panjang queue
        int POSITION_NUMBER = 0; // inisialisasi posisi angka
        for (int i = 0; i < SIZE; i++) { // iterasi sebanyak panjang queue
            int VALUE = QUEUE.remove(); // mengambil nilai dari queue
            if (VALUE < 0) { // jika nilai kurang dari 0
                STACK.push(VALUE); // menambahkan nilai ke stack
            } else { // jika nilai lebih dari 0
                QUEUE.add(VALUE); // menambahkan nilai ke queue
                POSITION_NUMBER++; // menambahkan posisi angka
            }
        }
        while (!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            QUEUE.add(STACK.pop()); // mengambil nilai dari stack dan menambahkan ke queue
        }
        for (int i = 0; i < POSITION_NUMBER; i++) { // iterasi sebanyak posisi angka
            QUEUE.add(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke queue
        }
    }
}

/*
Output:
Jumlah angka: 10
Masukkan angka ke-1: 1
Masukkan angka ke-2: 2
Masukkan angka ke-3: -2
Masukkan angka ke-4: 4
Masukkan angka ke-5: -5
Masukkan angka ke-6: 8
Masukkan angka ke-7: -8
Masukkan angka ke-8: 12
Masukkan angka ke-9: -15
Masukkan angka ke-10: 23
Sebelum: [1, 2, -2, 4, -5, 8, -8, 12, -15, 23]
Sesudah: [-15, -8, -5, -2, 1, 2, 4, 8, 12, 23]
 */