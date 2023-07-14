public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;

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
        if (enteredPin == pin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}

class ATM {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("123456789");
        bankAccount.setBalance(1000.0);
        bankAccount.setPin(1234);

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.withdrawMoney(500.0, 1234); // Correct PIN
        bankAccount.withdrawMoney(200.0, 5678); // Incorrect PIN
    }
}

