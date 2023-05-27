package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E3 {
    public static void main(String[] args) {
        mystery6(4, 1);
        System.out.println();
        mystery6(4, 2);
        System.out.println();
        mystery6(8, 2);
        System.out.println();
        mystery6(4, 3);
        System.out.println();
        mystery6(3, 4);
    }
    public static void mystery6 (int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ", ");
            mystery6(x, y - 1);
            System.out.print(", " + x * y);
        }
    }
}

/*
Output:
4
8, 4, 8
16, 8, 16
12, 8, 4, 8, 12
12, 9, 6, 3, 6, 9, 12
 */