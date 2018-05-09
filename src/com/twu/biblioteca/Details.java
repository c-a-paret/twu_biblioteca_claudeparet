package com.twu.biblioteca;

public class Details {

    private String title;
    private int year;
    private int ID;
    private String author;
    private String director;
    private String rating;

    public Details(String title, int year, int ID) {
        this.title = title;
        this.year = year;
        this.ID = ID;
    }

    public Details(String title, String author, int year, int ID) {
        this.title = title;
        this.year = year;
        this.ID = ID;
        this.author = author;
        this.director = null;
        this.rating = null;
    }

    public static Details book(String title, String author, int year, int ID) {
        return new Details(title, author, year, ID);
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public int getID() {
        return this.ID;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDirector() {
        return this.director;
    }

    public String getRating() {
        return this.rating;
    }
}
