package com.twu.biblioteca;

public class BookDetails {

    private String title;
    private String author;
    private int year;
    private int ID;

    public BookDetails(String title, String author, int year, int ID) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ID = ID;
    }


    // Getters

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public int getID() {
        return this.ID;
    }

    // Override Methods

    @Override
    public String toString() {
        return String.format("%-30s %-15s %6d %6s", this.getTitle(), this.getAuthor(), this.getYear(), this.getID());
    }

}
