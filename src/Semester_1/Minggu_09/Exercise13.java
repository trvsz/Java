package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise13.html"));
        
        while (ui.hasNextLine()) {
            String l = ui.nextLine();
            while (l.contains("<") || l.contains(">")) {
                int i1 = l.indexOf("<");
                int i2 = l.indexOf(">");
                if (i1 == 0) {
                    l = l.substring(i2 + 1);
                } else {
                    l = l.substring(0, i1) + l.substring(i2 + 1);
                }
            }
            System.out.println(l);
        }
    }
}
