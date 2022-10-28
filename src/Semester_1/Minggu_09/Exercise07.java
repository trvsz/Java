package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise07.txt"));

        while (ui.hasNextLine()) {
            String line = ui.nextLine();
            if (ui.hasNextLine()) {
                System.out.println(ui.nextLine());
            }
            System.out.println(line);
        }
    }
}
