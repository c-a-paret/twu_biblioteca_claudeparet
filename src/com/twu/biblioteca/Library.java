package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
        this.catalog.add(new Book("Title1", "Author1", 2001, 1234));
        this.catalog.add(new Book("Title2", "Author2", 2002, 2345));
        this.catalog.add(new Book("Title3", "Author3", 2003, 3456));
    }


    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableTitles = new ArrayList<Book>();
        for (Book book : this.catalog) {
            if (!book.isCheckedOut()) {
                availableTitles.add(book);
            }
        }
        return availableTitles;
    }

    public void seeAllAvailableBooks() {
        ArrayList<Book> availableTitles = getAvailableBooks();
        if (availableTitles.size() > 0) {
            System.out.printf("%-20s %15s %6s %6s", "Title", "Author", "Year", "ID\n");
            System.out.printf("===================================================\n");
            for (int i = 0; i < availableTitles.size(); i++) {
                System.out.println(availableTitles.get(i).getDetails());
            }
        } else {
            System.out.println("No titles are available!");
        }

    }

    public List<Book> getCatalog() {
        return this.catalog;
    }

    public void checkoutBook(int ID) {
        for (Book availableBook : getAvailableBooks()) {
            if (availableBook.getDetails().getID() == ID) {
                for (Book catalogBook : this.getCatalog()) {
                    if (catalogBook.getDetails().getID() == ID) {
                        catalogBook.checkOut();
                    }
                }
            }
        }
    }

    public void returnBook(int ID) {
        for (Book catalogBook : getCatalog()) {
            if (catalogBook.isCheckedOut() && catalogBook.getDetails().getID() == ID) {
                catalogBook.checkIn();
            }
        }
    }

}
