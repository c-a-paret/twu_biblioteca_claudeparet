package com.twu.biblioteca;

public class Book {

    Details details;
    private boolean checkedOut = false;

    public Book(String title, String author, int yearPublished) {
        this.details = new Details(title, author, yearPublished);
    }

    // Getters

    public Details getDetails() {
        return this.details;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }



    // Methods

    public void checkOut() {
        this.checkedOut = true;
        System.out.println("Book successfully checked out.");
    }

    public boolean checkIn() {
        if (this.checkedOut) {
            this.checkedOut = false;
            System.out.println("Book successfully checked in.");
            return true;
        }
        return false;
    }


    // Override Methods

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
