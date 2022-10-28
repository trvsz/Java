package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise11.txt"));
        int un = 0;

        while (ui.hasNextLine()) {
            Scanner l = new Scanner(ui.nextLine());
            un++;
            String rn = l.next();
            String mn = rn;
            int c = 1;
            int cm = 1;

            while (l.hasNext()) {
                String n2 = l.next();
                if (n2.equals(rn)) {
                    c++;
                    if (cm < c) {
                        cm = c;
                        mn = n2;
                    }
                } else {
                    rn = n2;
                    c = 1;
                    un++;
                }
            }
            System.out.println("Most common: " + mn);
        }
        System.out.println(un);
    }
}
