package book;

import book.bo.Book;
import book.bo.Contact;
import book.bo.Gender;

public class App {
    public static void main(String[] args) {
        Contact contact = new Contact("Priou","Dylan","06.06.06.06.06", Gender.M);
        Contact contact2 = new Contact("Priou","Dylan","06.06.06.06.06", Gender.M);
        System.out.println(contact.getGender().ordinal());
        System.out.println(contact.getGender().getLabel());
        Book book = new Book();
        book.addContact(contact);
        book.addContact(contact2);
        System.out.println(book.getContacts().size());
    }
}
