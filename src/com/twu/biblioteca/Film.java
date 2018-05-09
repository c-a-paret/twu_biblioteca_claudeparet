package com.twu.biblioteca;

public class Film extends Media {

    private Details details;

    public Film(String title, int year, String director, int rating, int ID) {
        this.details = Details.film(title, year, ID, director, rating);
    }

    // Getters

    public Details getDetails() {
        return this.details;
    }

    // Override Methods
    @Override
    public String toString() {
        return String.format("%-30s %-6s %-25s %6s %6s", this.details.getTitle(), this.details.getYear(), this.details.getDirector(), this.details.getRating(), this.details.getID());
    }

    @Override
    public boolean equals(Object object) {
        Film compareFilm = (Film) object;
        return (this.details.getTitle().equals(compareFilm.details.getTitle()) &&
                this.details.getYear() == (compareFilm.details.getYear()) &&
                (this.details.getDirector().equals(compareFilm.details.getDirector()) &&
                (this.details.getRating() == compareFilm.details.getRating()) &&
                this.details.getID() == compareFilm.details.getID()));
    }

}
