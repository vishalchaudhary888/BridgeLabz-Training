import java.util.*;

//UC 1 Create contacts in address book
class Contact{
    String name;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    Contact(String name,String lastName, String address,String city,String state,int zip,long phoneNumber,String email){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

class AddressBook{
    ArrayList<Contact> contactList = new ArrayList<>();
    public void addContact(Contact contact){
        contactList.add(contact);
        System.out.println("Contact added successfully");
    }
}
//UC 2 Ability to add a new Contact to Address Book from AddressBookMain class
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Vishal","Chaudhary","Kosi","Mathura","UP",281403,250005422,"vishalchaudhary5803@gmail.com");
        addressBook.addContact(contact);

    }
}
