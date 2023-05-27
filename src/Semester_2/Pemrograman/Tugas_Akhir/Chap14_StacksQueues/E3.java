package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;
import java.util.Stack;

public class E3 {
    public static void main(String[] args) {
        Scanner USER_INPUT = new Scanner(System.in);
        Stack <Integer> STACK1 = new Stack <Integer> ();
        Stack <Integer> STACK2 = new Stack <Integer> ();
        System.out.print("Jumlah angka yang akan dimasukkan (Stack 1): ");
        int JUMLAH_STACK1 = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_STACK1; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            STACK1.push(ANGKA);
        }
        System.out.print("Jumlah angka yang akan dimasukkan (Stack 2): ");
        int JUMLAH_STACK2 = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_STACK2; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int ANGKA = USER_INPUT.nextInt();
            STACK2.push(ANGKA);
        }
        System.out.println("Stack 1: " + STACK1);
        System.out.println("Stack 2: " + STACK2);
        System.out.println("Stack 1 dan Stack 2 sama? " + equals(STACK1, STACK2));
    }
    public static Boolean equals (Stack <Integer> STACK1, Stack <Integer> STACK2) {
        Stack <Integer> STORAGE = new Stack <Integer> ();
        
        if (STACK1.size() != STACK2.size()) {
            return false;
        } else {
            boolean EQUALS = true;
            while (EQUALS && !STACK1.isEmpty()) {
                int VALUE1 = STACK1.pop();
                int VALUE2 = STACK2.pop();
                if (VALUE1 != VALUE2) {
                    EQUALS = false;
                }
                STORAGE.add(VALUE1);
                STORAGE.add(VALUE2);
                
            }
            while (!STORAGE.isEmpty()) {
                STACK2.push(STORAGE.pop());
                STACK1.push(STORAGE.pop());
            }
            return EQUALS;
        }
    }
}

/*
Output:
Jumlah angka yang akan dimasukkan (Stack 1): 3
Masukkan angka ke-1: 7
Masukkan angka ke-2: 2
Masukkan angka ke-3: 8
Jumlah angka yang akan dimasukkan (Stack 2): 3
Masukkan angka ke-1: 7
Masukkan angka ke-2: 2
Masukkan angka ke-3: 8
Stack 1: [7, 2, 8]
Stack 2: [7, 2, 8]
Stack 1 dan Stack 2 sama? true

Jumlah angka yang akan dimasukkan (Stack 1): 3
Masukkan angka ke-1: 5
Masukkan angka ke-2: 1
Masukkan angka ke-3: 2
Jumlah angka yang akan dimasukkan (Stack 2): 3
Masukkan angka ke-1: 1
Masukkan angka ke-2: 2
Masukkan angka ke-3: 3
Stack 1: [5, 1, 2]
Stack 2: [1, 2, 3]
Stack 1 dan Stack 2 sama? false
 */