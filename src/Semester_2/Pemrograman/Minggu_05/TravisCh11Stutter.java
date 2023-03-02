package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11Stutter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Data ke-%d: ", i + 1);
            String data = ui.next();
            list.add(data);
        }
        System.out.println("Data sebelum di stutter: " + list);
        stutter(list);
    }
    public static void stutter(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }
        System.out.println("Data setelah di stutter: " + list);
    }
}

/*
Jumlah data yang ingin dimasukkan: 5
Data ke-1: 1
Data ke-2: 8
Data ke-3: 19
Data ke-4: 4
Data ke-5: 17
Data sebelum di stutter: [1, 8, 19, 4, 17]
Data setelah di stutter: [1, 1, 8, 8, 19, 19, 4, 4, 17, 17]
*/