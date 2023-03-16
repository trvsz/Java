package Semester_2.Pemrograman.Minggu_08;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.Scanner;

public class TravisCh12EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Returns: " + evenDigits(n));

    }
    public static int evenDigits(int n) {
        if (n == 0) {
        return 0;
    } else if (n % 2 != 0) {
        return evenDigits(n / 10);
    } else {
        return evenDigits(n / 10) * 10 + (n % 10);
    }
    }
}

/*
Enter a number: 8342116
Returns: 8426
 */