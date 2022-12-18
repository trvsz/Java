package Semester_1.Minggu_16.Inheritance;

// Exercise 5

public class Janitor extends Employee{
    public int getHours() {
        return super.getHours() * 2;
    }
    public double getSalary() {
        return super.getSalary() - 10000.0;
    }
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
