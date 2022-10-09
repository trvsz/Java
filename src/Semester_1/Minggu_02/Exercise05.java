package Semester_1.Minggu_02;

public class Exercise05 {
    public static void main(String[] args) {
        triangle();
        line();
        zonk();
        zonk1();
        zonk();
        triangle();
    }
    public static void triangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void line() {
        System.out.println("+------+ +------+");
    }
    public static void zonk() {
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        line();
    }
    public static void zonk1() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        line();
    }
}
