package Semester_2.Pemrograman.Minggu_09;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class TravisCh14InterLeave {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2);
        q.add(8);
        q.add(-5);
        q.add(19);
        q.add(7);
        q.add(3);
        q.add(24);
        q.add(42);
        System.out.println(q);
        interLeave(q);
        System.out.println(q);
    }
    public static void interLeave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            throw new IllegalArgumentException("Queue size must be even");
        }
        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < halfSize; i++) {
            q.add(q.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(q.remove());
        }
    }
}
