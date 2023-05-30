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
        Queue<Integer> QUEUE = new LinkedList<Integer>(); // inisialisasi queue
        int MIN = STACK.peek(); // inisialisasi nilai terkecil
        
        while(!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            int a = STACK.pop(); // mengambil nilai dari stack
            if(a < MIN) // jika nilai lebih kecil dari nilai terkecil
                MIN = a; // nilai terkecil menjadi nilai tersebut
            QUEUE.add(a); // menambahkan nilai ke queue
        }
        while(!QUEUE.isEmpty()) { // iterasi selama queue tidak kosong
            int VALUE = QUEUE.remove(); // mengambil nilai dari queue
            if(VALUE > MIN) { // jika nilai lebih besar dari nilai terkecil
                STACK.push(VALUE); // menambahkan nilai ke stack
            }
        }
        while(!STACK.isEmpty()) { // iterasi selama stack tidak kosong
            QUEUE.add(STACK.pop()); // mengambil nilai dari stack dan menambahkan ke queue
        }
        while(!QUEUE.isEmpty()) { // iterasi selama queue tidak kosong
            STACK.push(QUEUE.remove()); // mengambil nilai dari queue dan menambahkan ke stack
        }
        return MIN; // mengembalikan nilai terkecil
    }
}

/*
Output:
Sebelum: [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, -8, 4]
Nilai terkecil: -8
Sesudah: [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, 4]
 */