
class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Wings Of Fire","A.P.J Abdul Kalaam",500);
        book.borrowBook();

    }
}
