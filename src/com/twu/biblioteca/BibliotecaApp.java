package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library l1 = new Library();

        l1.seeAllAvailableBooks();
        l1.getCatalog().get(1).checkOut();
        l1.seeAllAvailableBooks();

    }






}
