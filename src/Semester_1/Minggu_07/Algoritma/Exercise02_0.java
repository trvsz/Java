package Semester_1.Minggu_07.Algoritma;

import java.util.*;

public class Exercise02_0 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Berapa pangkat berapa?");

        System.out.print("x = ");
        int x = ui.nextInt();

        System.out.print("n = ");
        int n = ui.nextInt();

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= x;
        }
        System.out.println(product);
    }
}
