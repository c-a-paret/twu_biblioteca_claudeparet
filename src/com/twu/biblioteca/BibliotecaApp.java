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
        

        while (loginPageRunning) {
            System.out.println("Select an option:\n1. Sign In\n2. Quit");
            System.out.print("\nEnter your choice (number): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a NUMBER: ");
                scanner.next();
            }

            int userFirstChoice = scanner.nextInt();

            switch (userFirstChoice) {
                case 1: // Sign in
                        System.out.print("\nEnter your Library Membership Number: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Please enter your library NUMBER: ");
                            scanner.next();
                        }
                        int userLibraryMembershipNumber = scanner.nextInt();
                        System.out.print("\nEnter your PIN: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Please enter you PIN as a NUMBER: ");
                            scanner.next();
                        }
                        int userPIN = scanner.nextInt();
                        if (library.userSignIn(userLibraryMembershipNumber, userPIN)){
                            loginPageRunning = false;
                            mainAppRunning = true;

                            printMenu();

                            while (mainAppRunning) {

                                System.out.print("\nEnter your choice (8 to see all menu options): ");

                                while (!scanner.hasNextInt()) {
                                    System.out.print("Please enter a NUMBER: ");
                                    scanner.next();
                                }

                                int userSecondChoice = scanner.nextInt();

                                switch (userSecondChoice) {
                                    case 1: // List Books
                                        library.seeAllAvailableBooks();
                                        break;
                                    case 2: // Check Out Book
                                        System.out.print("What is the ID of the book you would like to check out? ");
                                        while (!scanner.hasNextInt()) {
                                            System.out.print("Please enter a valid ID: ");
                                            scanner.next();
                                        }
                                        int userBookCheckoutIDChoice = scanner.nextInt();
                                        library.checkoutBook(userBookCheckoutIDChoice);
                                        break;
                                    case 3: // Return Book
                                        System.out.print("What is the ID of the book you would like to return? ");
                                        while (!scanner.hasNextInt()) {
                                            System.out.print("Please enter a valid ID: ");
                                            scanner.next();
                                        }
                                        int userBookReturnIDChoice = scanner.nextInt();
                                        library.returnBook(userBookReturnIDChoice);
                                        break;
                                    case 4: // List Films
                                        library.seeAllAvailableFilms();
                                        break;
                                    case 5: // Check Out Film
                                        System.out.print("What is the ID of the film you would like to check out? ");
                                        while (!scanner.hasNextInt()) {
                                            System.out.print("Please enter a valid ID: ");
                                            scanner.next();
                                        }
                                        int userFilmCheckoutIDChoice = scanner.nextInt();
                                        library.checkoutFilm(userFilmCheckoutIDChoice);
                                        break;
                                    case 6: // Return Film
                                        System.out.print("What is the ID of the film you would like to return? ");
                                        while (!scanner.hasNextInt()) {
                                            System.out.print("Please enter a valid ID: ");
                                            scanner.next();
                                        }
                                        int userFilmReturnIDChoice = scanner.nextInt();
                                        library.returnFilm(userFilmReturnIDChoice);
                                        break;
                                    case 8: // See menu options
                                        printMenu();
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
}
