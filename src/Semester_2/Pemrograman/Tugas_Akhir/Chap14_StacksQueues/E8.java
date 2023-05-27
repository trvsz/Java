package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E8 {
    public static void main(String[] args) {
        Stack <Integer> STACK = new Stack<>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka yang akan dimasukkan: ");
        int JUMLAH_ANGKA = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_ANGKA; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            STACK.push(ANGKA);
        }
        System.out.println("Sebelum: " + STACK);
        int MIN_VALUE = removeMin(STACK);
        System.out.println("Nilai terkecil: " + MIN_VALUE);
        System.out.println("Sesudah: " + STACK);
    }
    public static int removeMin(Stack <Integer> STACK) {
        Queue<Integer> QUEUE = new LinkedList<Integer>();
        int MIN = STACK.peek();
        
        while(!STACK.isEmpty()) {
            int a = STACK.pop();
            if(a < MIN)
                MIN = a;
            QUEUE.add(a);
        }
        while(!QUEUE.isEmpty()) {
            int VALUE = QUEUE.remove();
            if(VALUE > MIN) {
                STACK.push(VALUE);
            }
        }
        while(!STACK.isEmpty()) {
            QUEUE.add(STACK.pop());
        }
        while(!QUEUE.isEmpty()) {
            STACK.push(QUEUE.remove());
        }
        return MIN;
    }
}

/*
Output:
Sebelum: [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, -8, 4]
Nilai terkecil: -8
Sesudah: [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, 4]
 */