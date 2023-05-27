package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            list.add(USER_INPUT.nextInt());
        }
        System.out.println(list.min());
    }
}

/*
Ouptut:
Input number 1: 1
Input number 2: 2
Input number 3: 9
Input number 4: -9
Input number 5: 8 
Input number 6: 3
Input number 7: 0
-9
 */