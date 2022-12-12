package Semester_1.Minggu_16;

import java.util.Scanner;;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.print("Min? ");
        int min = ui.nextInt();

        System.out.print("Max? ");
        int max = ui.nextInt();

        for(int i = min; i <= max; i++) {
            for(int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for(int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }
}
