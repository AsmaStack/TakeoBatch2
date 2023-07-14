package Assignment2;

public class Atm {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.setAccountNumber("1231123");
        account.setBalance(5000.00);
        account.setPin(1234);

        //Getting Account Information
        System.out.println("Account Number is: " + account.getAccountNumber());
        System.out.println("Balance is: $" + account.getBalance());
        System.out.println("PIN is: " + account.getPin());

        //Withdrawing Account Information
        account.withdrawMoney(6000.00, 1234);
    }
}
