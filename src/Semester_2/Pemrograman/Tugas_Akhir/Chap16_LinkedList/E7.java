package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

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
