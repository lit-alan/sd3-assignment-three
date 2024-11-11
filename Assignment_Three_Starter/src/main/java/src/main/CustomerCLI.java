package src.main;

import src.app_prog_art.ASCIIArtGenerator;

import java.util.Scanner;

public class CustomerCLI {

   private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease Select an Option");
            System.out.println("1. Register a New Customer");
            System.out.println("2. View Customer Profile");
            System.out.println("3. Dynamic Query Builder");
            System.out.println("4. View All Customers");
            System.out.println("5. Seed Database");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> registerCustomer(scanner);
                case 2 -> viewCustomer(scanner);
                case 3 -> dynamicQueryBuilder(scanner);
                case 4 -> viewAllCustomers();
                case 5 -> generateQueries(scanner);
                case 6 -> exit = true;
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
        //display ASCII art before exiting
        ASCIIArtGenerator art = new ASCIIArtGenerator();
        try {
            art.printTextArt("Bye!", 14, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_DIALOG, "+");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Error with ASCII art " + ex);
        }//end try
    }

    private static void dynamicQueryBuilder(Scanner scanner) {
        System.out.println("Generate Dynamic Query");

        /*ToDo Build Qynamic Query */
    }

    private static void generateQueries(Scanner scanner) {

        System.out.println("Enter the number of records you want to generate");
        int numberOfRecords = scanner.nextInt();

        /* ToDo Generate Queries with Faker */

    }

    private static void registerCustomer(Scanner scanner) {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        System.out.println("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        System.out.println("Enter postcode: ");
        String postcode = scanner.nextLine();

       /* ToDo Insert Customer */
    }

    private static void viewCustomer(Scanner scanner) {
        System.out.println("Enter customer ID: ");


        /*ToDo View Customer By ID */
    }

    private static void viewAllCustomers() {

        System.out.println("View All Customers");
        /*ToDo View all Customers */

    }
}
