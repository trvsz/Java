package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise12.txt"));
        
        int j = 0;
        String t;
        int m;

        while (ui.hasNext()) {
            t = ui.next();
            m = ui.nextInt();
            if (t.equalsIgnoreCase("firstclass")) {
                j += 2 * m;
            } else if (t.equalsIgnoreCase("coach")) {
                j += m;
            }
        }
        System.out.println(j);
    }
}
