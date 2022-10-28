package Semester_1.Minggu_08.While_Loops;

import java.util.*;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        
        System.out.print("Masukkan angka yang akan dikomputasi: ");
        int x = ui.nextInt();

        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }
}

// input 1, output 1 0
// input 6, output 4 2
// input 19, output 16 4
// input 39, output 32 5
// input 74, output 64 6