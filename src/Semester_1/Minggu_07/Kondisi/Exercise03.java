package Semester_1.Minggu_07.Kondisi;

import java.util.*;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner u_input = new Scanner(System.in);
        System.out.println("Masukkan koordinat sesuai dengan x dan y.");

        System.out.print("x = ");
        int x = u_input.nextInt();

        System.out.print("y = ");
        int y = u_input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Kuadran 1");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Kuadran 4");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Kuadran 2");
        }
        else {
            System.out.println("Kuradran 3");
        }
    }
}
