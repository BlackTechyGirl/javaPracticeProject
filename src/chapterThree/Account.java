package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdraw(double withdrawAmout){
        if (withdrawAmout <= balance && withdrawAmout > 0) {
            balance -= withdrawAmout;
        }else throw new IllegalArgumentException("Withdraw amount exceeded account balance");
    }
}
