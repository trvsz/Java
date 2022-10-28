package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input file: Exercise03.txt

// What would be the output for the following code?
// If there would be an error, write error.
public class Exercise03_3 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise03.txt"));
        while (!input.hasNextInt()) {
            input.next();
        }
        System.out.println(input.nextInt()); //10
    }
}
