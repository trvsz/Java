package Semester_1.Minggu_12; //dapat dihapus jika menganggu kode

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

//Hanya menggunakan main()

public class TravisAkarDet {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai nilai:");

        System.out.print("a = ");
        int a = ui.nextInt();

        System.out.print("b = ");
        int b = ui.nextInt();

        System.out.print("c = ");
        int c = ui.nextInt();

        double Akar1, Akar2;

        int d = b * b - 4 * a * c;
        System.out.println("Determinan dari persamaan tersebut = " + d);

        if (d > 0) {
            Akar1 = (-b + Math.sqrt(d)) / (2 * a);
            Akar2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Akar-akar dari PK " + a + "x^2 + " + b + "x + " + c + " = 0 adalah x1 = %.2f dan x2 = %.2f", Akar1, Akar2);
        }
        else if (d == 0) {
            Akar1 = Akar2 = -b / (2 * a);
            System.out.printf("Akar-akar dari PK " + a + "x^2 + " + b + "x + " + c + " = 0 adalah x1 = x2 = %.2f;", Akar1);
        }
        else if (d < 0) {
            System.out.println("Akar-akar dari PK " + a + "x^2 + " + b + "x + " + c + " = 0 bukan bilangan real.");
        }
    }
}
