package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input file: Exercise04.txt

public class Exercise04 {
    public static void main(String[] args) throws FileNotFoundException {
        int wordCount = 0;
        Scanner input = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise04.txt"));
        
        while (input.hasNext()) {
            String word = input.next();
            wordCount++;
        }
        System.out.println("Total words = " + wordCount);
    }
}
