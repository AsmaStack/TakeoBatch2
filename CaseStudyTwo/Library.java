package CaseStudyTwo;

public class Library {
    public void displayItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.displayItemDetails();
            System.out.println("****----------****----------****----------****");
        }
    }
}

