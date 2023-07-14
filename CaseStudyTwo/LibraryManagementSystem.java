package CaseStudyTwo;

import java.time.LocalDate;

public class LibraryManagementSystem {

    public static void main(String[] args){

        Library library = new Library();

        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Java Programming", "John Smith", LocalDate.of(2020, 1, 1), 29.99, 500);
        items[1] = new Magazine("Tech Today", "Tech Publications", LocalDate.of(2023, 6, 1), 9.99, "XYZ123");
        items[2] = new Journal("Science Journal", "ABC Publications", LocalDate.of(2022, 12, 15), 49.99, "ISSN789");

        library.displayItems(items);
    }
}
