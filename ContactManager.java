import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void listAllContacts() {
        System.out.println("All Contacts: ");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void removeContact(String contactToremove){
        contacts.removeIf(contact -> contact.getName().equals(contactToremove));
        System.out.println("Contact " + contactToremove + " removed.");
    }
}
