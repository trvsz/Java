package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan input sesuai variabel.");

        System.out.print("x = ");
        int x = ui.nextInt();
        
        System.out.print("y = ");
        int y = ui.nextInt();

        int z = 0;
        while (x % y != 0) {
            x = x / y;
            z++;
            System.out.print(x + ", ");
        }
        System.out.println(z);
    }
}

// input 25, 2; output 12, 1
// input 32, 4; output 0
// input 10345, 10; output 1034, 103, 10, 3
// input 63, 2; output 31, 15, 7, 3, 1, 0, 6