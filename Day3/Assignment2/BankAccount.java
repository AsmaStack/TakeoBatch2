package Assignment2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;


    //Getter and Setter for AccountNumber
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    //Getter and Setter for balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    //Getter and Setter for pin
    public void setPin(int pin){
        this.pin = pin;
    }
    public int getPin(){
        return pin;
    }

    //Method for withdraw money

    public void withdrawMoney(double amount, int enteredPin){
        if(this.pin == enteredPin){
            if(this.balance > amount){
                this.balance = this.balance - amount;
                System.out.println("Withdrawal of $"+amount+" successful from account: "+this.accountNumber);
                System.out.println("New Balance: $"+balance);
            }else{
                System.out.println("Insufficient funds to withdraw");
            }
        }else{
            System.out.println("Invalid PIN. Please try again");
        }
    }
}
