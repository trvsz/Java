package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E6 {
    public static void main(String[] args) {
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
        System.out.println();
        writeSequence(6);
        System.out.println();
        writeSequence(7);
        System.out.println();
        writeSequence(8);
    }
    public static void writeSequence (int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1 ");
        } else if (n == 2) {
            System.out.print("1 1 ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            writeSequence(n - 2);
            System.out.print((n + 1) / 2 + " ");
        }
    }
}

/*
Output:
1 
1 1 
2 1 2 
2 1 1 2 
3 2 1 2 3 
3 2 1 1 2 3 
4 3 2 1 2 3 4 
4 3 2 1 1 2 3 4 
 */