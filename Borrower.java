import java.util.ArrayList;
import java.util.List;

public class Borrower {

        // instance variable
        private String borrowerName;
        private String borrowerAddress;
        private String borrowernumber;
        private List<Transaction> borrowinghistory; 


        public Borrower(String borrowerName, String borrowerAddress, String borrowernumber) { 
            this.borrowerName = borrowerName;
            this.borrowerAddress = borrowerAddress;
            this.borrowernumber = borrowernumber;
            this.borrowinghistory = new ArrayList<>();
    } 
       

        public String getBorrowerName() {
            return borrowerName;
        }
        public void setBorrowerName(String borrowerName) {
            this.borrowerName = borrowerName;
        }


        public String getBorrowerAddress() {
            return borrowerAddress;
        }
        public void setBorrowerAddress(String borrowerAddress) {
            this.borrowerAddress = borrowerAddress;
        }


        public String getBorrowernumber() {
            return borrowernumber;
        }
        public void setBorrowernumber(String borrowernumber) {
            this.borrowernumber = borrowernumber;
        }


        public List<Transaction> getBorrowinghistory() {
            return borrowinghistory;
        }
        public void setBorrowinghistory(List<Transaction> borrowinghistory) {
            this.borrowinghistory = borrowinghistory;
        }


    public static void main(String[] args) {
        
    }
}
