package com.twu.biblioteca;

public class Book extends Media {

    BookDetails details;

    public Book(String title, String author, int yearPublished, int ID) {
        this.details = new BookDetails(title, author, yearPublished, ID);
    }

    // Getters

    public BookDetails getDetails() {
        return this.details;
    }

    // Override Methods

    @Override
    public String toString() {
        return "Book object with:\n" +
                "Title: " + this.details.getTitle() + "\n" +
                "Author: " + this.details.getAuthor() + "\n" +
                "Year Published: " + this.details.getYear() + "\n" +
                "ID: " + this.details.getID();
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
