package Semester_2.Pemrograman.Tugas_Akhir.Chap14_StacksQueues;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Stack;

public class E1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(7);
        s.push(10);
        System.out.print(s.peek() + " ");
        System.out.print(s.pop() + " ");
        s.push(3);
        s.push(5);
        System.out.print(s.pop() + " ");
        System.out.print(s.size() + " ");
        System.out.print(s.peek() + " ");
        s.push(8);
        System.out.print(s.pop() + " ");
        System.out.print(s.pop());
    }
}

/*
push: Add an element to the top.
pop: Remove the top element.
peek: Examine the top element.
 */

/*
Output:
10 10 5 2 3 8 3
 */