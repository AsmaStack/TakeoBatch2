package Case3;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;

    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void withdrawMoney(double amount, int enteredPin) {
        if (enteredPin == this.pin) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is " + this.balance + ".");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}
