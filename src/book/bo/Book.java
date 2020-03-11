package book.bo;

import java.util.HashSet;
import java.util.Set;

public class Book {
    private Set<Contact> contacts;

    public Book(){
        contacts = new HashSet<>();
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void removeContact(Contact contact){
        contacts.remove(contact);
    }
}
