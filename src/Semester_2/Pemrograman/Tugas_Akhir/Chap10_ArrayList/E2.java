package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner ui = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int x = ui.nextInt();
        for (int i = 0; i < x; i++) { // Pengulangan untuk memasukkan nilai ke dalam list
            System.out.print("[ " + i + " ] = ");
            list.add(ui.nextInt());
        }
        mystery(list);
    }
    public static void mystery(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i += 2) { // Pengulangan untuk menggeser nilai dalam list
            int element = list.get(i); // Menyimpan nilai list ke dalam variabel element
            list.remove(i); // Menghapus nilai list
            list.add(element); // Menambahkan nilai element ke dalam list
        }
        System.out.println(list);
    }
}

/*
Output:
How many numbers do you want to enter? 6
[ 0 ] = 10
[ 1 ] = 20
[ 2 ] = 30
[ 3 ] = 40
[ 4 ] = 50
[ 5 ] = 60
[20, 30, 50, 60, 40, 10]

How many numbers do you want to enter? 4
[ 0 ] = 2
[ 1 ] = 4
[ 2 ] = 6
[ 3 ] = 8
[4, 6, 2, 8]

How many numbers do you want to enter? 9
[ 0 ] = -4
[ 1 ] = 16
[ 2 ] = 9
[ 3 ] = 1
[ 4 ] = 64
[ 5 ] = 25 
[ 6 ] = 36
[ 7 ] = 4
[ 8 ] = 49
[16, 9, 64, 25, 4, 49, 1, 36, -4]
 */