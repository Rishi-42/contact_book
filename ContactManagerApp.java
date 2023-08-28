import java.util.Scanner;

public class ContactManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        boolean exit = false;

        while (!exit) {
            System.out.println("Contact Book");
            System.out.println("1. Add Contact");
            System.out.println("2. List all Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone_number = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    Contact newContact = new Contact(name, phone_number, email, address);
                    contactManager.addContact(newContact);
                    break;
                
                case 2:
                    contactManager.listAllContacts();
                    break;

                case 3:
                    System.out.print("Enter Contact user name to remove: ");
                    String contactToRemove = scanner.nextLine();
                    contactManager.removeContact(contactToRemove);

                case 4:
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;

            }
        }
        scanner.close();
    }
}
