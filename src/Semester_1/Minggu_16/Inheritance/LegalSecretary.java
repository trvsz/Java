package Semester_1.Minggu_16.Inheritance;

public class LegalSecretary  extends Secretary{
    public double getSalary() {
        return super.getSalary() + 5000.0;      // $45,000.00 / year
    }
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}