package com.twu.biblioteca;

public class Book extends Media {

    private Details details;

    public Book(String title, String author, int yearPublished, int ID) {
        this.details = Details.book(title, author, yearPublished, ID);
    }

    // Getters

    public Details getDetails() {
        return this.details;
    }

    // Override Methods
    // TODO: 09/05/2018 This override method is redundant
    // %-30s %-15s %6s %6s", "Title", "Author", "Year", "ID
    @Override
    public String toString() {
        return String.format("%-30s %-15s %6s %6s", this.details.getTitle(), this.details.getAuthor(), this.details.getYear(), this.details.getID());

//        "Book object with:\n" +
//                "Title: " + this.details.getTitle() + "\n" +
//                "Author: " + this.details.getAuthor() + "\n" +
//                "Year Published: " + this.details.getYear() + "\n" +
//                "ID: " + this.details.getID();
    }

    @Override
    public boolean equals(Object object) {
        Book compareBook = (Book) object;
        return (this.details.getTitle().equals(compareBook.details.getTitle()) &&
                this.details.getAuthor().equals(compareBook.details.getAuthor()) &&
                (this.details.getYear() == compareBook.details.getYear()) &&
                 this.details.getID() == compareBook.details.getID());
    }


}
