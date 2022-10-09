package Semester_1.Minggu_05.Return;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println(pay(4.00, 11));
    }
    public static double pay(double salary, int hours) {
        if (hours <= 8) {
            return hours * salary;
        } else {
            return (salary * 8) + (salary * 1.5) * (hours - 8);
        }
    }
}
