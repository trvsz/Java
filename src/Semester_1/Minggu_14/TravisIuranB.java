package Semester_1.Minggu_14;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.Scanner;

public class TravisIuranB {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Ada berapa orang? ");
        int jmlOrang = ui.nextInt();

        //array
        int [] Array = new int[jmlOrang];
        for (int i = 0; i < jmlOrang; i++) {
            System.out.print("Orang ke " + (i+1) + " berapa rupiah? ");
            Array[i] = ui.nextInt();
        }
        double sum = iuran(Array);

        //pemanggilan
        System.out.printf("Total uang terkumpul ada %4.2f rupiah.", sum);
        System.out.println();
        System.out.printf("Rata-rata uang yang terkumpul ada %4.2f rupiah.", avg(jmlOrang, sum));
        System.out.println();
        System.out.println("Yang iuran di bawah rata-rata ada " + lowr(Array, avg(jmlOrang, sum)) + " orang.");
    }
    public static double iuran(int[] Array) {
        double sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }
    public static double avg(int jmlOrang, double sum) {
        double avg;
        avg = sum / jmlOrang;
        return avg;
    }
    public static int lowr(int[] Array, double avg) {
        int lowr = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < avg) {
                lowr++;
            }
        }
        return lowr;
    }
}
/*
    Ada berapa orang? 4
    Orang ke 1 berapa rupiah? 1000
    Orang ke 2 berapa rupiah? 2000
    Orang ke 3 berapa rupiah? 5000
    Orang ke 4 berapa rupiah? 3000
    Total uang terkumpul ada 11000.00 rupiah
 */

/*
  * Ada berapa orang? 2
    Orang ke 1 berapa rupiah? 10
    Orang ke 2 berapa rupiah? 30
    Total uang terkumpul ada 40.00 rupiah.
    Rata-rata uang yang terkumpul ada 20.00 rupiah.
    Yang iuran di bawah rata-rata ada 1 orang.
  */