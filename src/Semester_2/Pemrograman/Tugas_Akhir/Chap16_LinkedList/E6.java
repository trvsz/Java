package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        LinkedIntList LIST = new LinkedIntList();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            LIST.add(USER_INPUT.nextInt());
        }
        System.out.println("Deleted: " + LIST.deleteBack());
        System.out.println("List Adter: " + LIST.toString());
    }
}

/*
Output:
Input number 1: 10
Input number 2: 20
Input number 3: 30
Input number 4: 40
Input number 5: 50
Deleted: 50
List Adter: [10, 20, 30, 40]
 */
