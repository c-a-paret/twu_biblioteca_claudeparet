package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Biblioteca!");

        boolean loginPageRunning = true;
        boolean mainAppRunning = false;

        // TODO: 10/05/2018 Should I generalise the request for input - there is a lot of duplication?
        // mainAppUserInput(scanner, );

        while (loginPageRunning) {

            int userFirstChoice = loginPageMenu(scanner);

            switch (userFirstChoice) {
                case 1: // Sign in
                        int userLibraryMembershipNumber = mainAppUserInput(scanner, "\nEnter your Library Membership Number: ", "Please enter a valid library NUMBER: ");

                        int userPIN = mainAppUserInput(scanner, "\nEnter your PIN: ","Please enter you PIN as a NUMBER: ");

                        if (library.userSignIn(userLibraryMembershipNumber, userPIN)){
                            loginPageRunning = false;
                            mainAppRunning = true;

                            printMenu();

                            while (mainAppRunning) {

                                int userSecondChoice = mainAppUserInput(scanner, "\nEnter your choice (8 to see all menu options): ", "Please enter a NUMBER: ");

                                switch (userSecondChoice) {
                                    case 1: // List Books
                                        library.seeAllAvailableBooks();
                                        break;
                                    case 2: // Check Out Book
                                        int userBookCheckoutIDChoice = mainAppUserInput(scanner, "What is the ID of the book you would like to check out? ", "Please enter a valid ID: ");
                                        library.checkoutBook(userBookCheckoutIDChoice);
                                        break;
                                    case 3: // Return Book
                                        int userBookReturnIDChoice = mainAppUserInput(scanner, "What is the ID of the book you would like to return? ", "Please enter a valid ID: ");
                                        library.returnBook(userBookReturnIDChoice);
                                        break;
                                    case 4: // List Films
                                        library.seeAllAvailableFilms();
                                        break;
                                    case 5: // Check Out Film
                                        int userFilmCheckoutIDChoice = mainAppUserInput(scanner, "What is the ID of the film you would like to check out? ", "Please enter a valid ID: ");
                                        library.checkoutFilm(userFilmCheckoutIDChoice);
                                        break;
                                    case 6: // Return Film
                                        int userFilmReturnIDChoice = mainAppUserInput(scanner,"What is the ID of the film you would like to return? ", "Please enter a valid ID: ");
                                        library.returnFilm(userFilmReturnIDChoice);
                                        break;
                                    case 8: // See menu options
                                        printMenu();
                                        break;
                                    case 7: // View account details
                                            library.viewUserDetails();
                                            break;
                                    case 9: // Quit
                                        System.out.println("\nThank you for using the Biblioteca app!");
                                        mainAppRunning = false;
                                        loginPageRunning = true;
                                        break;
                                    default: // Any other choice
                                        System.out.println("Select a valid option!");
                                        break;
                                }
                            }
                        }
                        break;
                case 2: // Quit
                        System.out.println("\nThank you for using the Biblioteca app!");
                        loginPageRunning = false;
                        break;
                default: // Any other input
                         System.out.println("Please select a valid option!");
                         break;
            }
        }


    }

    // Menu printers and user input acceptance methods

    public static void printMenu() {
        System.out.println("\nSelect an option:\n" +
                "=====================\n" +
                "1. List Books\n" +
                "2. Check Out a Book\n" +
                "3. Return a Book\n" +
                "=====================\n" +
                "4. List Films\n" +
                "5. Check Out a Film\n" +
                "6. Return a Film\n" +
                "=====================\n" +
                "7. View your account details\n" +
                "=====================\n" +
                "8. See menu options\n" +
                "9. Quit");
    }

    public static int loginPageMenu(Scanner scanner) {
        System.out.println("\nSelect an option:\n1. Sign In\n2. Quit");
        System.out.print("\nEnter your choice (number): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a NUMBER: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static int mainAppUserInput(Scanner scanner, String request, String errorMessage) {
        System.out.print(request);
        while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
