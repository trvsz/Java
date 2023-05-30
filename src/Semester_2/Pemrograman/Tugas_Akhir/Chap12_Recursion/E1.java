package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E1 {
    public static void main(String[] args) {
        mystery2(1);
        System.out.println();
        mystery2(4);
        System.out.println();
        mystery2(16);
        System.out.println();
        mystery2(30);
        System.out.println();
        mystery2(100);
    }
    public static void mystery2 (int n) { // Method untuk mencetak nilai
        if (n <= 1) { // Jika n kurang dari sama dengan 1
            System.out.print(n); // Mencetak nilai n
        } else { // Jika n lebih dari 1
            mystery2(n / 2); // Memanggil method dengan nilai n dibagi 2
            System.out.print(", " + n); // Mencetak nilai n
        }
    }
}

/*
Output:
1
1, 2, 4
1, 2, 4, 8, 16
1, 3, 7, 15, 30
1, 3, 6, 12, 25, 50, 100
 */