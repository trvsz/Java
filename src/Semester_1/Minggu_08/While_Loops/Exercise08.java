package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String i = ui.next();
    
        if (i.length() == 0) {
            System.out.print("");
        } else {
            System.out.print(i.charAt(0));
            for (int f = 1; f < i.length(); f++) {
                System.out.print("-" + i.charAt(f));
            }
        }
        System.out.println();
    }
}
