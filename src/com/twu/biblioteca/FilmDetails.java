package com.twu.biblioteca;

public class FilmDetails {

    private String name;
    private int year;
    private String director;
    private int rating;
    private int ID;


    public FilmDetails(String name, int year, String director, int rating, int ID) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public int getRating() {
        return this.rating;
    }

    public int getID() {
        return this.ID;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-6d %15s %4d %6d", this.getName(), this.getYear(), this.getDirector(), this.getRating(), this.getID());
    }
}
