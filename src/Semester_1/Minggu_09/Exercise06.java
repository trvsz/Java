package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input file: Exercise06.txt

public class Exercise06 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise06.txt"));
        
        double max = 0.0;
        double plus = 0.0;

        System.out.print("running sum = " + plus);
        while (ui.hasNextDouble()) {
            plus += ui.nextDouble();
            System.out.print(" " + plus);
            if (plus > max) {
                max = plus;
            }
        }
        System.out.println();
        System.out.println("max sum = " + max);
    }
}
