package Semester_1.Minggu_07.Kondisi;
//hehe rada nyeleweng
import java.util.*;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Masukkan tiga angka yang akan dikomputasi.");

        System.out.print("a = ");
        int a = user_input.nextInt();

        System.out.print("b = ");
        int b = user_input.nextInt();

        System.out.print("c = ");
        int c = user_input.nextInt();

        if (a == b && b != c || a == c && b!= a || b == c && c != a) {
            System.out.print("Terdapat 2 angka unik.");
        }
        if (a == b && b == c && c == a) {
            System.out.print("Terdapat 1 angka unik.");
        }
        else {
            System.out.print("Terdapat 3 angka unik.");
        }
    }
}
