package Semester_1.Minggu_08.While_Loops;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        String i, fn, ln;
        i = ui.nextLine();
        fn = i.substring(0, 1).toUpperCase();
        ln = i.substring(i.indexOf(" ") + 1, i.length());

        while(i.contains(" ") == false || i.length() < 5){
            System.out.println("Error, must be at least 5 chars with a single space.");
            System.out.print("Type your name: ");
            i = ui.nextLine();
        }
        String name = ln + ", " + fn;
        System.out.println("Your name is: " + name);
    }
}
