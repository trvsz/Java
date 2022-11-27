package Semester_1.Minggu_12;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisRectangleC {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Program ini menghitung luas Rectangle.");

        System.out.print("Masukkan panjang: ");
        double p = ui.nextDouble();
        
        System.out.print("Masukkan lebar: ");
        double l = ui.nextDouble();

        System.out.println("Rectangle Anda dengan panjang " + p + " dan lebar " + l + " mempunyai luas " + luas(p, l));
    }
    public static double luas(double p, double l) {
        return p * l;
    }
}
