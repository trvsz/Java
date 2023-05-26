package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E8 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList <>();
        Set <Integer> set = new HashSet <>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah angka yang akan dimasukkan (List): ");
        int JUMLAH_LIST = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_LIST; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            list.add(USER_INPUT.nextInt());
        }
        System.out.print("Jumlah angka yang akan dimasukkan (Set): ");
        int JUMLAH_SET = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH_SET; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            set.add(USER_INPUT.nextInt());
        }
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        Map <Integer, Integer> countMap = counts(list, set);
        System.out.println("Count Map: " + countMap);
    }
    public static Map <Integer, Integer> counts (List <Integer> list, Set <Integer> set) {
        Map <Integer, Integer> countMap = new HashMap <>();
        for (int num : list) {
            if (set.contains((num))) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        return countMap;
    }
}

/*
Output:
Jumlah angka yang akan dimasukkan (List): 13
Masukkan angka ke-1: 4
Masukkan angka ke-2: -2
Masukkan angka ke-3: 3
Masukkan angka ke-4: 9
Masukkan angka ke-5: 4
Masukkan angka ke-6: 17
Masukkan angka ke-7: 5
Masukkan angka ke-8: 29
Masukkan angka ke-9: 14
Masukkan angka ke-10: 87
Masukkan angka ke-11: 4
Masukkan angka ke-12: -2
Masukkan angka ke-13: 100
Jumlah angka yang akan dimasukkan (Set): 3
Masukkan angka ke-1: -2
Masukkan angka ke-2: 4
Masukkan angka ke-3: 29
List: [4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100]
Set: [-2, 4, 29]
Count Map: {-2=2, 4=3, 29=1}
 */