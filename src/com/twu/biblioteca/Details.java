package com.twu.biblioteca;

public class Details {

    // Fields

    private String title;
    private int year;
    private int ID;
    private String author;
    private String director;
    private int rating;


    // Constructors
    // Book
    private Details(String title, String author, int year, int ID) {
        this.title = title;
        this.year = year;
        this.ID = ID;
        this.author = author;
        this.director = null;
        this.rating = 0;
    }
    // Film
    private Details(String title, int year, int ID, String director, int rating) {
        this.title = title;
        this.year = year;
        this.ID = ID;
        this.author = null;
        this.director = director;
        this.rating = rating;
    }

    // Media type constructor method calls
    public static Details book(String title, String author, int year, int ID) {
        return new Details(title, author, year, ID);
    }

    public static Details film(String title, int year, int ID, String director, int rating) {
        return new Details(title, year, ID, director, rating);
    }


    // Getters
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

    public int getRating() {
        return this.rating;
    }
}
