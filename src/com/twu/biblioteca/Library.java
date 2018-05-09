package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> catalogBooks;

    public Library() {
        this.catalogBooks = new ArrayList<>();
        this.catalogBooks.add(new Book("The Course of Love", "Alain de Botton", 2016, 1234));
        this.catalogBooks.add(new Book("Daring Greatly", "Brene Brown", 2012, 2345));
        this.catalogBooks.add(new Book("Knots", "R. D. Laing", 1970, 3456));
    }


    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableTitles = new ArrayList<Book>();
        for (Book book : this.catalogBooks) {
            if (!book.isCheckedOut()) {
                availableTitles.add(book);
            }
        }
        return availableTitles;
    }

    public void seeAllAvailableBooks() {
        ArrayList<Book> availableTitles = getAvailableBooks();
        if (availableTitles.size() > 0) {
            System.out.printf("%-30s %-15s %6s %6s", "Title", "Author", "Year", "ID\n");
            System.out.printf("============================================================\n");
            for (int i = 0; i < availableTitles.size(); i++) {
                System.out.println(availableTitles.get(i).getDetails());
            }
        } else {
            System.out.println("No titles are available to check out! Please wait until someone returns a book.");
        }

    }

    public List<Book> getCatalogBooks() {
        return this.catalogBooks;
    }

    public boolean checkoutBook(int ID) {
        for (Book availableBook : getAvailableBooks()) {
            if (availableBook.getDetails().getID() == ID) {
                for (Book catalogBook : this.getCatalogBooks()) {
                    if (catalogBook.getDetails().getID() == ID) {
                        catalogBook.checkOut();
                        return true;
                    }
                }
            }
        }
        System.out.println("That book is not available.");
        return false;
    }

    public boolean returnBook(int ID) {
        for (Book catalogBook : getCatalogBooks()) {
            if (catalogBook.isCheckedOut() && catalogBook.getDetails().getID() == ID) {
                catalogBook.checkIn();
                return true;
            }
        }
        System.out.println("That is not a valid book to return.");
        return false;
    }

}
