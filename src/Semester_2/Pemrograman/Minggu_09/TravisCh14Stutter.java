package Semester_2.Pemrograman.Minggu_09;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class TravisCh14Stutter {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(7);
        s.push(1);
        s.push(14);
        s.push(9);

        System.out.println(s);
        stutter(s);
        System.out.println(s);
    }

    public static void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
            q.add(n);
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        Collections.reverse(s);
    }
}