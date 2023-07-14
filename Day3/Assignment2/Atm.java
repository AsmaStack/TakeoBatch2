package Day3.Assignment2;

public class Atm {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();

    //Set the account details
    bankAccount.setAccountNumber("1245658945");
   double currentBalance = 20000.90;

    //Acessing and modifying the account attributes
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        
        bankAccount.setPin(1234);
        int pin  = bankAccount.getPin();

        
        bankAccount.setBalance(10000.5);
         double balance = bankAccount.getBalance();

        if(pin == 1234){
            //Withdraw
            if (balance <= bankAccount.getBalance()){
                balance = currentBalance -balance;
                System.out.println("Withdraw Successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else{
            System.out.println("Invalid PIN.");
        }
    }
}
