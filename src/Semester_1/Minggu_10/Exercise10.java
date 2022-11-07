package Semester_1.Minggu_10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int count = ui.nextInt();
        int[] nums = new int[count];

        System.out.println("Your numbers in forward order: ");
        pf(nums);

        System.out.println("Your numbers in backward order: ");
        pb(nums);
    }
    public static void pf(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void pb(int[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
