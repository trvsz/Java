package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise09.txt"));

        while (ui.hasNextLine()) {
            String l = ui.nextLine();
            Scanner i = new Scanner(l);
            int h = 0;
            int t = 0;

            while (i.hasNext()) {
                t++;
                if (i.next().toLowerCase().equals("h")) {
                    h++;
                }
            }

            System.out.printf("%d heads (%.1f%%)\n", h, h * 100.0 / t);
            if (h * 100 / t > 50) {
                System.out.println("You win!");
            }
            System.out.println();
        }
    }
}
