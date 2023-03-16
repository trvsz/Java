package Semester_2.Pemrograman.Minggu_08;

// Travis Zusa Zuve Saputra
// 22537141013

public class TravisCh12WriteChars {
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
    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}

/*
*
**
<*>
<**>
<<*>>
<<**>>
<<<*>>>
<<<**>>>
*/