package Semester_1.Minggu_08.Random_Numbers;

import java.util.Random;

public class Exercise02 {
    public static void main(String[] args) {
        int i = 0;
        Random r = new Random();
        int j;

        do {
            j = 1 + r.nextInt(50);
            i++;
            System.out.println("guess = " + j);
        } while (j < 48);
        System.out.println("total guesses = " + i);
    }
}
