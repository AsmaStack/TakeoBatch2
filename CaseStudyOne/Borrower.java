package CaseStudyOne;
import java.util.ArrayList;
import java.util.List;

class Borrower{
    private String name;
    private String address;
    private String contact;
    private List<Transaction> borrowingHistory;

    //Constructor or method declaration ???

    public Borrower(String name, String address, String contact){
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.borrowingHistory = new ArrayList<>();
    }
    //For name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //For address

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    //For contacts
    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return contact;
    }

    //For borrowing history

    public List<Transaction> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(List<Transaction> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }

}