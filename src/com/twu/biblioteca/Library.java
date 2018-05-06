package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> shelf;

    public Library() {
        this.shelf = new ArrayList<>();
        this.shelf.add(new Book("Title1", "Author1", 2001));
        this.shelf.add(new Book("Title2", "Author2", 2002));
        this.shelf.add(new Book("Title3", "Author3", 2003));
    }



}
