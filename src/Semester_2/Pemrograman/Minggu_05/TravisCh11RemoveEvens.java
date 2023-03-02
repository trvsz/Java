package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11RemoveEvens {
    public static void main(String[] args) {
        Set <Integer> s1 = new HashSet<Integer>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + i +" ] Data: ");
            int data = ui.nextInt();
            s1.add(data);
        }
        Set <Integer> s2 = removeEvens(s1);
        System.out.println("Data s1: " + s1);
        System.out.println("Data s2: " + s2);
    }
    public static Set<Integer> removeEvens(Set <Integer> s1) {
        Set <Integer> output = new TreeSet<>();
        for (Integer num : s1) {
            if (num % 2 == 0) {
                output.add(num);
            }
        }
        s1.removeAll(output);
        return output;
    }
}

/*
Jumlah data yang ingin dimasukkan: 8
[ 0 ] Data: 0
[ 1 ] Data: 17
[ 2 ] Data: 16
[ 3 ] Data: 7
[ 4 ] Data: 10
[ 5 ] Data: 12
[ 6 ] Data: 13
[ 7 ] Data: 14
Data s1: [17, 7, 13]
Data s2: [0, 10, 12, 14, 16]
*/