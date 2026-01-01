
class Book{
    static String libraryName = "Jatin's Library";
    final String isbn;
    private String title;
    private String author;

    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void display2(){
        if(this instanceof Book){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("isbn: "+isbn);
        }
        else{
            System.out.println("Book is not Present in library");
        }
    }
    public static void display(){
        System.out.println(libraryName);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("Wings Of Fire","A.P.J Abdul Kalaam","0025AAB");
        b1.display();
        b1.display2();
    }
}
