package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E2 {
    public static void main(String[] args) {
        System.out.println(mystery3(6));
        System.out.println(mystery3(17));
        System.out.println(mystery3(259));
        System.out.println(mystery3(977));
        System.out.println(mystery3(-479));
    }
    public static int mystery3 (int n) { // Method untuk mengembalikan nilai
        if (n < 0) { // Jika n kurang dari 0
            return -mystery3(-n); // Mengembalikan nilai negatif dari method dengan nilai n negatif
        } else if (n < 10) { // Jika n kurang dari 10
            return n; // Mengembalikan nilai n
        } else { // Jika n lebih dari sama dengan 10
            return mystery3(n / 10 + n % 10); // Mengembalikan nilai dari method dengan nilai n dibagi 10 ditambah n modulus 10
        }
    }
}

/*
Output:
6
8
7
5
-2
 */
