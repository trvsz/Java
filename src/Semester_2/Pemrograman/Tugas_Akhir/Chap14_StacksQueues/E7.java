package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

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
        Stack <Integer> STACK = new Stack <Integer> ();
        int SIZE = QUEUE.size();
        for (int i = 0; i < SIZE / 2; i++) {
            STACK.push(QUEUE.remove());
        }
        while (!STACK.isEmpty()) {
            QUEUE.add(STACK.pop());
        }
        for (int i = 0; i < SIZE / 2; i++) {
            QUEUE.add(QUEUE.remove());
        }
        for (int i = 0; i < SIZE / 2; i++) {
            STACK.push(QUEUE.remove());
        }
        while (!STACK.isEmpty()) {
            QUEUE.add(STACK.pop());
            QUEUE.add(QUEUE.remove());
        }
        if (QUEUE.size() % 2 == 1) {
            throw new IllegalArgumentException();
        }
    }
}
