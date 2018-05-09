package com.twu.biblioteca;

public class Film {

    FilmDetails details;
    private boolean checkedOut = false;

    public Film(String name, int year, String director, int rating, int ID) {
        this.details = new FilmDetails(name, year, director, rating, ID);
    }

    // Getters

    public FilmDetails getDetails() {
        return this.details;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }



    // Methods

    public void checkOut() {
        this.checkedOut = true;
        System.out.println("Thank You! Enjoy the film.");
    }

    public void checkIn() {
        this.checkedOut = false;
        System.out.println("Thank you for returning the film.");
    }

    @Override
    public String toString() {
        return "Film object with:\n" +
                "Name: " + this.details.getName() + "\n" +
                "Year: " + this.details.getYear() + "\n" +
                "Director: " + this.details.getDirector() + "\n" +
                "Rating: " + this.details.getRating() + "\n" +
                "ID: " + this.details.getID();
    }

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
