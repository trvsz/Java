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
        Stack <Integer> STACK = new Stack<>();
        int SIZE = QUEUE.size();
        int POSITION_NUMBER = 0;
        for (int i = 0; i < SIZE; i++) {
            int VALUE = QUEUE.remove();
            if (VALUE < 0) {
                STACK.push(VALUE);
            } else {
                QUEUE.add(VALUE);
                POSITION_NUMBER++;
            }
        }
        while (!STACK.isEmpty()) {
            QUEUE.add(STACK.pop());
        }
        for (int i = 0; i < POSITION_NUMBER; i++) {
            QUEUE.add(QUEUE.remove());
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