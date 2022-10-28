package Semester_1.Minggu_09;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// input file: Exercise03.txt

// What would be the output for the following code? 
// if there would be an error, write error.

public class Exercise03_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise03.txt"));
        System.out.println(input.nextDouble()); //6.7
        System.out.println(input.nextDouble()); //error
    }
}