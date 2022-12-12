package Semester_1.Minggu_15;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class TravisUlanganArray {
    public static void main(String[] args) {
        int Array[] = {1, 5, 4, 3, 2};
        terbesar(Array);
        rerata(Array);
        tampil(Array);
        tampilMundur(Array);
    }

    static void terbesar(int Array[]) {
        double max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        System.out.println(max);
    }

    static void rerata(int Array[]) {
        double total = 0;
        for (int i = 0; i < Array.length; i++) {
            total = total + Array[i];
        }
        double avg = total / Array.length;
        System.out.println(avg);
    }

    static void tampil(int Array[]) {
        System.out.print("{" + Array[0]);
        for (int i = 1; i < Array.length; i++) {
            System.out.print("," + Array[i]);
        }
        System.out.print("}");
        System.out.println();
    }

    static void tampilMundur(int Array[]) {
        System.out.print("{");
        for (int i = Array.length - 1; i >= 1; i--) {
            System.out.print(Array[i] + ",");
        }
        System.out.print(Array[0] + "}");
    }
}
