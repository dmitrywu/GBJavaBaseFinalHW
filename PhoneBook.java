import java.util.*;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();}

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).addPhoneNumber(phoneNumber);} 
        else {
            Contact contact = new Contact(name, phoneNumber);
            contacts.put(name, contact);}
    }

    public void removeContact(String name) {
        contacts.remove(name);}

    public void removePhoneNumber(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).delPhoneNumber(phoneNumber);}
    }

    public void displayContacts() {
        List<Contact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumbers().size()));
        for (Contact contact : sortedContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumbers());}
    }
}