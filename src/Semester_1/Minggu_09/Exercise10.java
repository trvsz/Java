package Semester_1.Minggu_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ui = new Scanner(new File("D:/Kuliah/Software/Visual Studio Code/Java New/src/Semester_1/Minggu_09/Exercise10.txt"));

        String w, w2;
        
        while (ui.hasNextLine()) {
            Scanner l = new Scanner(ui.nextLine());
            int r = 1;
            w = l.next();
            
            while (l.hasNext()) {
                w2 = l.next();

                while (w.equals(w2)) {
                    r++;
                    if (l.hasNext()) {
                        w2 = l.next();
                    } else {
                        break;
                    }
                }
                if (r != 1) {
                    System.out.print(w + "*" + r + " ");
                }
                r = 1;
                w = w2;
            }
            System.out.println();
            
        }
    }
}
