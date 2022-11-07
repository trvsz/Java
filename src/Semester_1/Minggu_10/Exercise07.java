package Semester_1.Minggu_10;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Berapa angka yang ingin dieksekusi? ");
        int p = ui.nextInt();
        int a[] = new int[p];

        for (int i = 0; i < a.length ; i++) {
            System.out.print("Type a number: ");
            a[i] = ui.nextInt();
        }
        System.out.println("Hasil: ");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                a[i] = a[i + 1];
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
/*
 * 4, 4
 * 3, 6, 6
 * 7, 8, 8, 4
 * 5, 7, 7, 4, 4
 * 4, 6, 6, 7, 9, 9
 */