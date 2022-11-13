package Semester_1.Minggu_10;

public class Exercise14 {
    public static void main(String[] args) {
        int [] a1 = {10, 20, 30, 40, 50, 60};
        int [] a2 = {10, 20, 30, 40, 50, 60};
        int [] a3 = {20, 3, 50, 10, 68};

        if (equals(a1, a2) == true) {
            System.out.println("a1 dan a2 sama");
        }
        if (equals(a1, a3) == true) {
            System.out.println("a1 dan a3 sama");
        } else {
            System.out.println("a1 dan a3 tidak sama");
        }
    }
    public static boolean equals(int[] a1, int [] a2) {
        if (a1.length != a2.length) {
            return false;
        } else {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
