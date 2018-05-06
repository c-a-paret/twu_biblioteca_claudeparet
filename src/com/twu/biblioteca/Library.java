package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
        this.catalog.add(new Book("Title1", "Author1", 2001));
        this.catalog.add(new Book("Title2", "Author2", 2002));
        this.catalog.add(new Book("Title3", "Author3", 2003));
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

    public List<Book> getCatalog() {
        return this.catalog;
    }
}
