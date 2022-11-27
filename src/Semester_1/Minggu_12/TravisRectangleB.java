package Semester_1.Minggu_12;

import java.util.Scanner;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class TravisRectangleB {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Program ini menghitung luas Rectangle.");

        System.out.print("Masukkan panjang: ");
        double p = ui.nextDouble();
        
        System.out.print("Masukkan lebar: ");
        double l = ui.nextDouble();

        double luas = p * l;
        System.out.println("Rectangle anda dengan panjang " + p + " dan lebar " + l + " mempunyai luas " + luas);
    }
}
