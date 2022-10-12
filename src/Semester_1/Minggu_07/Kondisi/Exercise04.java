package Semester_1.Minggu_07.Kondisi;

import java.util.*;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Nilai dari GPA? ");
        double GPA = ui.nextDouble();
        
        int credits = 5;
        if (GPA > 1.5) {
            if (GPA == 4.0) {
                System.out.println("I'm valedictorian for this class! Woo hoo!");
            }
            if (GPA >= 3.5) {
                System.out.println("I made the dean's list for this class!"); 
            }
        }
        else if (GPA < 1.5) {
            credits = 0;
            System.out.println("Uh-oh..I probably should have studied a little more.");
        }
        System.out.println("I received " + credits + " credits for this class.");
    }
}
