package Semester_2.Pemrograman.Minggu_09;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class TravisCh14RemoveMin {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(2); 
        s.push(8);
        s.push(3);
        s.push(19);
        s.push(2);
        s.push(3);
        s.push(2);
        s.push(7);
        s.push(12);
        s.push(-8);
        s.push(4);
        
        int min1 = removeMin(s);
        System.out.println("Removed minimum value: " + min1);
        int min2 = removeMin(s);
        System.out.println("Removed minimum value: " + min2);
        System.out.println("Remaining stack elements: " + s);
    }
    public static int removeMin(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int min = s.peek();
        
        while(!s.isEmpty()) {
            int a = s.pop();
            if(a < min)
                min = a;
            q.add(a);
        }
        while(!q.isEmpty()) {
            int a = q.remove();
            if(a > min) {
                s.push(a);
            }
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        return min;
    }
}

/*
 * Output:
 * Removed minimum value: -8
 * Removed minimum value: 2
 * Remaining stack elements: [8, 3, 19, 3, 7, 12, 4]
 */
