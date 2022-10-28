package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Masukkan nilai pada n");
        
        System.out.print("n = ");
        int n = ui.nextInt();

        int x = 1;
        int y = 2;
        while (y < n) {
            if (n % y == 0) {
                n = n /y;
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x + " " + n);
    }
}

// mystery4(2); 1 2
// mystery4(5); 1 5
// mystery4(24); 4 3
// mystery4(28); 3 7