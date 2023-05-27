package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E5 {
    public static void main(String[] args) {
        Queue <Integer> QUEUE = new LinkedList <> ();
        Scanner USER_INPUT = new Scanner (System.in);
        System.out.print("Jumlah angka yang akan dimasukkan: ");
        int JUMLAH_ANGKA = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_ANGKA; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            QUEUE.add(ANGKA);
        }
        System.out.println("Palindrome? " + isPalindrome(QUEUE));
    }
    public static Boolean isPalindrome (Queue <Integer> QUEUE) {
        Stack <Integer> STACK = new Stack <> ();
        int SIZE = QUEUE.size();
        for (int i = 0; i < SIZE; i++) {
            int VALUE = QUEUE.remove();
            QUEUE.add(VALUE);
            STACK.push(VALUE);
        }
        boolean PALINDROME = true;
        for (int i = 0; i < SIZE; i++) {
            int VALUE1 = QUEUE.remove();
            int VALUE2 = STACK.pop();
            if (VALUE1 != VALUE2) {
                PALINDROME = false;
            }
            QUEUE.add(VALUE1);
        }
        return PALINDROME;
    }
}

/*
Output:
Jumlah angka yang akan dimasukkan: 7
Masukkan angka ke-1: 1 
Masukkan angka ke-2: 2
Masukkan angka ke-3: 3
Masukkan angka ke-4: 4
Masukkan angka ke-5: 3
Masukkan angka ke-6: 2
Masukkan angka ke-7: 1
Palindrome? true
 */