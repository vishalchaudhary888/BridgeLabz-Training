class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN);   // public
        System.out.println("Title: " + title); // protected
        System.out.println("Author: " + getAuthor());
    }
}

public class LibrarySystem2 {
    public static void main(String[] args) {
        EBook ebook = new EBook("ISBN123", "Java Programming", "James Gosling");
        ebook.display();

        ebook.setAuthor("Oracle");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

