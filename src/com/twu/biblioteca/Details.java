package com.twu.biblioteca;

public class Details {

    private String title;
    private String author;
    private int year;

    public Details(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    // Override Methods

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nYear Published: " + this.getYear();
    }

}
