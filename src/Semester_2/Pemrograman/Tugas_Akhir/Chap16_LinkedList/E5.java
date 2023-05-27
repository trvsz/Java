package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

import java.util.Scanner;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E5 {
    public static void main(String[] args) {
        LinkedIntList LIST = new LinkedIntList();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            LIST.add(USER_INPUT.nextInt());
        }
        System.out.println(LIST.hasTwoConsecutive());
    }
}

/*
Output:
How many numbers do you want to input? 8
Input number 1: 1
Input number 2: 18
Input number 3: 2
Input number 4: 7
Input number 5: 8
Input number 6: 39
Input number 7: 18
Input number 8: 40
true
 */
