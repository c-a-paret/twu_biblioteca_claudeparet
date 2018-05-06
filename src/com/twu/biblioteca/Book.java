package com.twu.biblioteca;

public class Book {

    Details details;

    public Book(String title, String author, int yearPublished) {
        this.details = new Details(title, author, yearPublished);
    }


    public Details getDetails() {
        return this.details;
    }

    @Override
    public String toString() {
        return "Book object with:\n" +
                "Title: " + this.details.getTitle() + "\n" +
                "Author: " + this.details.getAuthor() + "\n" +
                "Year Published: " + this.details.getYear();
    }

    @Override
    public boolean equals(Object object) {
        Book compareBook = (Book) object;
        return (this.details.getTitle().equals(compareBook.details.getTitle()) &&
                this.details.getAuthor().equals(compareBook.details.getAuthor()) &&
                (this.details.getYear() == compareBook.details.getYear()));
    }
}
