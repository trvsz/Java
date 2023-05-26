package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner ui = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int x = ui.nextInt();
        for (int i = 0; i < x; i++) { // Pengulangan untuk memasukkan nilai ke dalam list
            System.out.print("[ " + i + " ] = ");
            list.add(ui.nextInt());
        }
        mystery2(list);
    }
    public static void mystery2 (ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) { // Pengulangan untuk menggeser nilai dalam list
            if (i % 2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }
}

/*
Output:

How many numbers do you want to enter? 3
[ 0 ] = 10
[ 1 ] = 20
[ 2 ] = 30
[20, 10, 20, 30, 30, 20]

How many numbers do you want to enter? 5
[ 0 ] = 8
[ 1 ] = 2
[ 2 ] = 9
[ 3 ] = 7
[ 4 ] = 4
[8, 7, 8, 2, 9, 7, 4, 4, 2, 8]

How many numbers do you want to enter? 6
[ 0 ] = -1
[ 1 ] = 3
[ 2 ] = 28
[ 3 ] = 17
[ 4 ] = 9
[ 5 ] = 33
[33, 28, 33, -1, 3, 28, 17, 9, 33, 17, -1, 33]
 */
