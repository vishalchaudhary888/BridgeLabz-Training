
class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Published in: "+publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;

    Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Name: "+name);
        System.out.println("bio: "+bio);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Author("Wings Of Fire",2015,"APJ","Motivational Book");
        book1.displayInfo();
    }
}
