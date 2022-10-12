package Semester_1.Minggu_07.Algoritma;

import java.util.*;

public class Exercise02_1 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Berapa pangkat berapa.");

        System.out.print("x = ");
        double x = ui.nextDouble();

        System.out.print("n = ");
        int n = ui.nextInt();

        double product = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                product *= x;
            }
        }
        else if (n < 0) {
            for (int i = n; i < 0; i++) {
                product *= 1 / x;
            }
        }
        System.out.println(product);
    }
}
