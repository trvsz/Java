package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        int x = ui.nextInt();

        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);
    }
}

// input 19; output 19 0
// input 42; output 21 1
// input 48; output 3 4
// input 40; output 5 3
// input 64; output 1 6