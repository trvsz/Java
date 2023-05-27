package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E4 {
    public static void main(String[] args) {
        Queue<Integer> QUEUE = new LinkedList<Integer>();
        for (int i = 1; i <= 6; i++) {
            QUEUE.add(i);
        }
        for (int i = 0; i < QUEUE.size(); i++) {
            System.out.print(QUEUE.remove() + " ");
        }
        System.out.println(QUEUE + " size " + QUEUE.size());
    }
}

/*
Output:
1 2 3 [4, 5, 6] size 3
 */