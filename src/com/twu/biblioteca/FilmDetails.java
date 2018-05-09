package com.twu.biblioteca;

public class FilmDetails extends Details {

    private String director;
    private int rating;

    public FilmDetails(String title, int year, String director, int rating, int ID) {
        super(title, year, ID);
        this.director = director;
        this.rating = rating;

    }

    public String getDirector() {
        return this.director;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-6d %15s %4d %6d", this.getTitle(), this.getYear(), this.getDirector(), this.getRating(), this.getID());
    }
}
