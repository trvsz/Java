package Semester_1.Minggu_10;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int count = ui.nextInt();
        int a[] = new int[count];

        for (int i = 0; i < a.length ; i++) {
            System.out.print("Type a number: ");
            a[i] = ui.nextInt();
        }

        System.out.println();
        System.out.println("Your numbers in forward order:");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Your numbers in backward order:");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
