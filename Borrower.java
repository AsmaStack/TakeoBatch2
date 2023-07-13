import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private String address;
    private String contactNumber;
    private List<Transaction> borrowingHistory;

    public Borrower(String name, String address, String contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.borrowingHistory = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<Transaction> getBorrowingHistory() {
        return borrowingHistory;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setBorrowingHistory(List<Transaction> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }
}
