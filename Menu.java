import java.util.Scanner;

public class Menu {
    private PhoneBook phoneBook;
    private Scanner scanner;

    public Menu(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nSelect option:");
            System.out.println("1. Add contact");
            System.out.println("2. Add number");
            System.out.println("3. Delete number");
            System.out.println("4. Delete contact");
            System.out.println("5. Show contacts");
            System.out.println("6. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\033[H\033[J");
                    System.out.print("Input name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Input number: ");
                    String phoneNumber1 = scanner.nextLine();
                    phoneBook.addContact(name1, phoneNumber1);
                    break;
                case 2:
                    System.out.print("\033[H\033[J");
                    phoneBook.displayContacts();
                    System.out.print("Input name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Input number: ");
                    String phoneNumber2 = scanner.nextLine();
                    phoneBook.addContact(name2, phoneNumber2);
                    break;
                case 3:
                    System.out.print("\033[H\033[J");
                    phoneBook.displayContacts();
                    System.out.print("Input name: ");
                    String name3 = scanner.nextLine();
                    System.out.print("Input number: ");
                    String phoneNumber3 = scanner.nextLine();
                    phoneBook.removePhoneNumber(name3, phoneNumber3);
                    break;
                case 4:
                    System.out.print("\033[H\033[J");
                    phoneBook.displayContacts();
                    System.out.print("Input name: ");
                    String name4 = scanner.nextLine();
                    phoneBook.removeContact(name4);
                    break;
                case 5:
                    System.out.print("\033[H\033[J");
                    phoneBook.displayContacts();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Input option number 1-6");
            }
        }
    }
}