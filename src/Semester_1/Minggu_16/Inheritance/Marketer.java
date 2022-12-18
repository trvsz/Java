package Semester_1.Minggu_16.Inheritance;

// Exercise 4

public class Marketer extends Employee {
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}
