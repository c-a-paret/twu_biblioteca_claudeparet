package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library l1 = new Library();

        l1.seeAllAvailableBooks();
        l1.returnBook(9999);
        l1.seeAllAvailableBooks();
        l1.checkoutBook(2345);
        l1.seeAllAvailableBooks();
        l1.checkoutBook(1234);
        l1.checkoutBook(3456);
        l1.seeAllAvailableBooks();
        l1.returnBook(9999);
        l1.returnBook(1234);
        l1.seeAllAvailableBooks();
    }






}
