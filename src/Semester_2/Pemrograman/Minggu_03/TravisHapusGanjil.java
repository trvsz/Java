package Semester_2.Pemrograman.Minggu_03;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class TravisHapusGanjil {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        
        hapusGanjil(list);
    }
    public static void hapusGanjil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            } 
        }
        System.out.println(list);
    }
}

// [0, 2, 4, 6, 8, 10]