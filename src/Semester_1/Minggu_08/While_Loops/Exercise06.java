package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai yang ingin dikomputasi");

        System.out.print("x = ");
        int x = ui.nextInt();
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}
