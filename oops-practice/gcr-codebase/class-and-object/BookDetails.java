class Book{
    private String title;
    private String author;
    private float price;

    Book(String title,String author,float price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void display(){
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book: "+author);
        System.out.println("Price of the book: "+price);
        System.out.println("<===========================>");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book author1 = new Book("2States","Chetan Bhagat",500);
        Book author2 = new Book("Wings Of Fire","Abdul kalam .A.P.J",500);
        author1.display();
        author2.display();
    }
}
