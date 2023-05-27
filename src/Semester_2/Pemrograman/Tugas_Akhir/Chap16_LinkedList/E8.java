package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        LinkedIntList LIST = new LinkedIntList();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            LIST.add(USER_INPUT.nextInt());
        }
        System.out.println("List before: " + LIST.toString());
        LIST.doubleList();
        System.out.println("List after: " + LIST.toString());
    }
}

/*
Output:
How many numbers do you want to input? 4
Input number 1: 1
Input number 2: 3
Input number 3: 2
Input number 4: 4
List before: [1, 3, 2, 4]
List after: [1, 3, 2, 4, 1, 3, 2, 4]
 */