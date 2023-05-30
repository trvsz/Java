package Semester_2.Pemrograman.Tugas_Akhir.Chap12_Recursion;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E4 {
    public static void main(String[] args) {
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
    }
    public static void writeChars (int n) {
        if (n < 1) { // Jika n kurang dari 1
            throw new IllegalArgumentException("n harus lebih besar dari 1"); // Membuat exception
        }
        if (n == 1) { // Jika n sama dengan 1
            System.out.print("*"); // Print *
        } else if (n == 2) { // Jika n sama dengan 2
            System.out.print("**"); // Print **
        } else { // Jika n lebih dari 2
            System.out.print("<"); // Print <
            writeChars(n - 2); // Panggil method dengan nilai n dikurangi 2
            System.out.print(">"); // Print >
        }
    }
}

/*
Output:
*
**
<*>
<**>
<<*>>
<<**>>
<<<*>>>
<<<**>>>
 */