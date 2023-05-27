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
        Queue <Integer> QUEUE = new LinkedList <Integer> ();
        while (!STACK.isEmpty()) {
            int VALUE = STACK.pop();
            QUEUE.add(VALUE);
            QUEUE.add(VALUE);
        }
        while (!QUEUE.isEmpty()) {
            STACK.push(QUEUE.remove());
        }
        Collections.reverse(STACK);
    }
}

/*
Output:
Before stutter: [3, 7, 1, 14, 9]
After stutter: [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]
 */