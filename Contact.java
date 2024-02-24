import java.util.List;
import java.util.ArrayList;

public class Contact {
    private String contactName;
    private List<String> phoneNumbers;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);}

    public String getName() {
        return contactName;}

    public List<String> getPhoneNumbers() {
        return phoneNumbers;}

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);}

    public void delPhoneNumber(String phoneNumber) {
        phoneNumbers.remove(phoneNumber);}
}