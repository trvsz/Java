package Semester_2.Minggu_01;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class TravisLastDigit {
    public static void main(String[] args) {
        int a = 3572;
        int b = -947;
        int c = 6;
        int d = 35;
        int e = 123456;
        System.out.printf("Bilangan %d memiliki digit terakhir %d.", a, lastDigit(a));
        System.out.printf("\nBilangan %d memiliki digit terakhir %d.", b, lastDigit(b));
        System.out.printf("\nBilangan %d memiliki digit terakhir %d.", c, lastDigit(c));
        System.out.printf("\nBilangan %d memiliki digit terakhir %d.", d, lastDigit(d));
        System.out.printf("\nBilangan %d memiliki digit terakhir %d.", e, lastDigit(e));
    }
    public static int lastDigit(int angka) {
        return Math.abs(angka % 10);
    }
}

/*
Bilangan 3572 memiliki digit terakhir 2.
Bilangan -947 memiliki digit terakhir 7.
Bilangan 6 memiliki digit terakhir 6.
Bilangan 35 memiliki digit terakhir 5.
Bilangan 123456 memiliki digit terakhir 6.
*/