package Semester_1.Minggu_11;

// Exercise 7, 11

// Exercise 7 BJP4 Exercise 8.11: transactionFeeBankAccount
public class Exercise07 {
    String name;
    double balance;
    int transactions;

    public Exercise07 (String id) {
        name = id;
    }

    public double getBalance () {
        return balance;
    }

    public String getID () {
        return name;
    }
    
    public String getTransaction() {
        String x = Integer.toString(transactions);
        return x;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        transactions++;
    }
    public void deposit (double amount) {
        balance = balance + amount;
        transactions++;
    }
    public boolean transactionsFee(double fee) {
        double deduction = 0.0;
    
        for (int i = 1; i <= transactions; i++) {
            deduction += i * fee;
        }
        if (deduction < balance) {
            balance -= deduction;
            return true;
        }
        balance = 0.0;
        return false;
    }

    // Exercise 11 BJP4 Exercise 8.12: toStringBankAccount
    public String toString() {
        if (balance > 0) {
            return String.format("%s, $%.2f", name, balance);
        } else  if (balance < 0) {
            return String.format("%s, -$%.2f", name, -balance);
        } else {
            return name + ", $0.00";
        }
    }
}