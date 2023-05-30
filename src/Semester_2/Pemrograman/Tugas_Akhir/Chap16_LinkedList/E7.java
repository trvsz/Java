package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E7 {
    public static void main(String[] args) {
        LinkedIntList LIST = new LinkedIntList();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            LIST.add(USER_INPUT.nextInt());
        }
        System.out.print("Input number to delete: ");
        int DELETE = USER_INPUT.nextInt();
        LIST.removeAll(DELETE);
        System.out.println("List after: " + LIST.toString());
    }
}

/*
Output:
How many numbers do you want to input? 10
Input number 1: 3
Input number 2: 9
Input number 3: 4
Input number 4: 2
Input number 5: 3
Input number 6: 8
Input number 7: 17
Input number 8: 4
Input number 9: 3
Input number 10: 18
Input number to delete: 3
List after: [9, 4, 2, 8, 17, 4, 18]
 */