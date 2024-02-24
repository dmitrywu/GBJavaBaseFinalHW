public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Menu menu = new Menu(phoneBook);
        menu.displayMenu();}
}