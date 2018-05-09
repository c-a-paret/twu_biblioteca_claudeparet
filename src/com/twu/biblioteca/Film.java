package com.twu.biblioteca;

public class Film extends Media {

    FilmDetails details;

    public Film(String name, int year, String director, int rating, int ID) {
        this.details = new FilmDetails(name, year, director, rating, ID);
    }

    // Getters

    public FilmDetails getDetails() {
        return this.details;
    }

    // Override Methods
    // TODO: 09/05/2018 This override method is redundant
//    @Override
//    public String toString() {
//        return "Film object with:\n" +
//                "Name: " + this.details.getName() + "\n" +
//                "Year: " + this.details.getYear() + "\n" +
//                "Director: " + this.details.getDirector() + "\n" +
//                "Rating: " + this.details.getRating() + "\n" +
//                "ID: " + this.details.getID();
//    }

    @Override
    public boolean equals(Object object) {
        Film compareFilm = (Film) object;
        return (this.details.getName().equals(compareFilm.details.getName()) &&
                this.details.getYear() == (compareFilm.details.getYear()) &&
                (this.details.getDirector().equals(compareFilm.details.getDirector()) &&
                (this.details.getRating() == compareFilm.details.getRating()) &&
                this.details.getID() == compareFilm.details.getID()));
    }

}
