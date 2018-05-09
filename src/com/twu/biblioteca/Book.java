package com.twu.biblioteca;

public class Book {

    BookDetails details;
    private boolean checkedOut = false;

    public Book(String title, String author, int yearPublished, int ID) {
        this.details = new BookDetails(title, author, yearPublished, ID);
    }

    // Getters

    public BookDetails getDetails() {
        return this.details;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }



    // Methods

    public void checkOut() {
        this.checkedOut = true;
        System.out.println("Thank You! Enjoy the book.");
    }

    public void checkIn() {
        this.checkedOut = false;
        System.out.println("Thank you for returning the book.");
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
