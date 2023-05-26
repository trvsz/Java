package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Set;
import java.util.TreeSet;

public class E3 {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<Integer>();
        set.add(74);
        set.add(12);
        set.add(74);
        set.add(74);
        set.add(43);
        set.remove(74);
        set.remove(999);
        set.remove(43);
        set.add(32);
        set.add(12);
        set.add(9);
        set.add(999);
        System.out.println(set);
    }
}

/*
Output:
[9, 12, 32, 999]
 */
