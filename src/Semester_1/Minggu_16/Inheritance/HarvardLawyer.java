package Semester_1.Minggu_16.Inheritance;

// Exercise 6

public class HarvardLawyer extends Lawyer{
    public double getSalary() {
        return super.getSalary() + super.getSalary() / 5.0;
    }
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    public void sue() {
        super.sue();
    }
    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}
