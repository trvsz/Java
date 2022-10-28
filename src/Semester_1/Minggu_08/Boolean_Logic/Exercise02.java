package Semester_1.Minggu_08.Boolean_Logic;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int i = ui.nextInt();
        
        boolean result = true;
        i = Math.abs(i);
        if (i == 0) {
            result = false;
        }
        
        while (i != 0) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                result = false;
            }
            i /= 10;
        }
        System.out.println(result);
    }
}
