package com.twu.biblioteca;

public class BookDetails extends Details {

    private String author;

    public BookDetails(String title, String author, int year, int ID) {
        super(title, year, ID);
        this.author = author;
    }

    // Getters

    public String getAuthor() {
        return this.author;
    }

    // Override Methods

    @Override
    public String toString() {
        return String.format("%-30s %-15s %6d %6s", this.getTitle(), this.getAuthor(), this.getYear(), this.getID());
    }

}
