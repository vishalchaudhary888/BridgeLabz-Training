class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | ₹" + price);
    }
}
public class BookProgramme {
    public static void main(String[] args) {
        Book book1 = new Book("Wings Of Fire","A.P.J Abdul Kalaam",500);
        book1.display();
    }
}

