import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        System.out.println("Welcome to Rohan Bhardwaj Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
    }
}
