package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer N = USER_INPUT.nextInt();
        System.out.println("Returns: " + evenDigits(N));
    }
    public static Integer evenDigits (Integer n) {
        if (n == 0) { // Jika n sama dengan 0
        return 0; // Mengembalikan nilai 0
        } else if (n % 2 != 0) { // Jika n modulus 2 tidak sama dengan 0
            return evenDigits(n / 10); // Panggil method dengan nilai n dibagi 10
        } else { // Jika n modulus 2 sama dengan 0
            return evenDigits(n / 10) * 10 + (n % 10); // Panggil method dengan nilai n dibagi 10 dikali 10 ditambah n modulus 10
        }
    }
}

/*
Output:
Enter a number: 8342116
Returns: 8426
 */