package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E4 {
    public static void main(String[] args) {
        Queue<Integer> QUEUE = new LinkedList<Integer>(); // inisialisasi queue
        for (int i = 1; i <= 6; i++) { // iterasi sebanyak 6 kali
            QUEUE.add(i); // menambahkan nilai ke queue
        }
        for (int i = 0; i < QUEUE.size(); i++) { // iterasi sebanyak panjang queue
            System.out.print(QUEUE.remove() + " "); // mengambil nilai dari queue
        }
        System.out.println(QUEUE + " size " + QUEUE.size()); // menampilkan nilai queue dan panjang queue
    }
}

/*
Output:
1 2 3 [4, 5, 6] size 3
 */