package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Biblioteca!");

        boolean running = false;

        while (running) {

            System.out.println("\nSelect an option:\n" +
                               "1. List Books\n" +
                               "2. Check Out a Book\n" +
                               "3. Return a Book\n" +
                               "4. Quit");

            System.out.print("\nEnter your choice (number): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: // List Books
                        library.seeAllAvailableBooks();
                        break;
                case 2: // Check Out Book
                        System.out.print("What is the ID of the book you would like to check out? ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Please enter a valid ID: ");
                            scanner.next();
                        }
                        int userCheckoutIDChoice = scanner.nextInt();
                        library.checkoutBook(userCheckoutIDChoice);
                        break;
                case 3: // Return Book
                        System.out.print("What is the ID of the book you would like to return? ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Please enter a valid ID: ");
                            scanner.next();
                        }
                        int userReturnIDChoice = scanner.nextInt();
                        library.returnBook(userReturnIDChoice);
                        break;
                case 4: // Quit
                    System.out.println("\nThank you for using the Biblioteca app!");
                        running = false;
                        break;
                default: // Any other choice
                         System.out.println("Select a valid option!");
                         break;
            }
        }
    }
}
