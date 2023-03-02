package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11HasOdd {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[ "+ i +" ] Data: ");
            int data = ui.nextInt();
            list.add(data);
        }
        System.out.println("Hasilnya adalah " + hasOdd(list));
    }
    public static boolean hasOdd(Set<Integer> list) {
        for (int num : list) {
            if (num % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}

/*
Jumlah data yang ingin dimasukkan: 6
[ 0 ] Data: 14
[ 1 ] Data: 6
[ 2 ] Data: 37
[ 3 ] Data: 2
[ 4 ] Data: 19
[ 5 ] Data: 8
Hasilnya adalah true
*/