package Semester_2.Pemrograman.Minggu_09;

import java.util.Queue;
import java.util.LinkedList;

public class TravisCh14StackMystery {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= 6; i++) {
            queue.add(i);
        }
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.remove() + " ");
        }
        System.out.print(queue + " size " + queue.size());
    }
}