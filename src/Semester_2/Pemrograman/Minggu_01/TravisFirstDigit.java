package Semester_2.Pemrograman.Minggu_01;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class TravisFirstDigit {
    public static void main(String[] args) {
        int a = 3572;
        int b = -947;
        int c = 6;
        int d = 35;
        int e = 123456;
        System.out.printf("Bilangan %d memiliki digit pertama %d.\n", a, firstDigit(a));
        System.out.printf("Bilangan %d memiliki digit pertama %d.\n", b, firstDigit(b));
        System.out.printf("Bilangan %d memiliki digit pertama %d.\n", c, firstDigit(c));
        System.out.printf("Bilangan %d memiliki digit pertama %d.\n", d, firstDigit(d));
        System.out.printf("Bilangan %d memiliki digit pertama %d.\n", e, firstDigit(e));
    }
    public static int firstDigit(int angka) {
        while (angka >= 10 || angka <= -10) {
            System.out.println(angka);
            angka = angka / 10;
        }
        return Math.abs(angka);
    }
}

/*
Bilangan 3572 memiliki digit pertama 3.
Bilangan -947 memiliki digit pertama 9.
Bilangan 6 memiliki digit pertama 6.
Bilangan 35 memiliki digit pertama 3.
Bilangan 123456 memiliki digit pertama 1.
 */