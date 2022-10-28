package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// The next couple problems are about a file called Exercise03.txt that has the following contents:

// What would be the output from the following code, as it would appear on the console?

public class Exercise03_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise03.txt"));
        System.out.println(input.next()); //6.7
        System.out.println(input.next()); //This
        System.out.println(input.next()); //file
    }
}