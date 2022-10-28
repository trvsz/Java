package Semester_1.Minggu_09;

import java.util.Scanner;

public class Exercise08 {
    public static void countWords(Scanner input) {
        int lineCount = 0;
        int wordCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine(); // read one line
            lineCount++;
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                wordCount++;
            }
        }
        System.out.println("Total lines = " + lineCount);
        System.out.println("Total words = " + wordCount);
        System.out.printf("Average words per line = %.3f\n", (double) wordCount / lineCount );
    }
}
