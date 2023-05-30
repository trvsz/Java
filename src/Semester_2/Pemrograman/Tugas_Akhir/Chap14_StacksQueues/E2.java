package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/* 
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E2 {
    public static void main(String[] args) {
        Stack <Integer> STACK = new Stack<>();
        STACK.push(3);
        STACK.push(7);
        STACK.push(1);
        STACK.push(14);
        STACK.push(9);
        System.out.println("Before stutter: " + STACK);
        stutter(STACK);
        System.out.println("After stutter: " + STACK);
    }
    public static void stutter(Stack <Integer> STACK) {
        Queue <Integer> QUEUE = new LinkedList <Integer> (); // inisialisasi queue
        while (!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            int VALUE = STACK.pop(); // mengambil nilai dari stack
            QUEUE.add(VALUE); // menambahkan nilai ke queue
            QUEUE.add(VALUE); // menambahkan nilai ke queue
        }
        while (!QUEUE.isEmpty()) { // iterasi selama queue tidak kosong
            STACK.push(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke stack
        }
        Collections.reverse(STACK); // membalikkan nilai stack
    }
}

/*
Output:
Before stutter: [3, 7, 1, 14, 9]
After stutter: [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]
 */