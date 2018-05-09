package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> catalogBooks;
    private List<Film> catalogFilms;

    public Library() {

        // Just initialise some books and films since and Add() method is not required
        this.catalogBooks = new ArrayList<>();
        this.catalogFilms = new ArrayList<>();

        this.catalogBooks.add(new Book("The Course of Love", "Alain de Botton", 2016, 1234));
        this.catalogBooks.add(new Book("Daring Greatly", "Brene Brown", 2012, 2345));
        this.catalogBooks.add(new Book("Knots", "R. D. Laing", 1970, 3456));

        this.catalogFilms.add(new Film("Moonrise Kingdom", 2012, "Wes Anderson", 9, 4321));
        this.catalogFilms.add(new Film("No Country For Old Men", 2007, "The Coen Brothers", 10, 5432));
        this.catalogFilms.add(new Film("Saw 1", 2004, "James Wan", 9, 6543));
    }


    // Getters

    public List<Book> getCatalogBooks() {
        return this.catalogBooks;
    }

    public List<Film> getCatalogFilms() {
        return this.catalogFilms;
    }


    // Methods for Books

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableTitles = new ArrayList<Book>();
        for (Book book : this.catalogBooks) {
            if (!book.isCheckedOut()) {
                availableTitles.add(book);
            }
        }
        return availableTitles;
    }

    public void seeAllAvailableBooks() {
        ArrayList<Book> availableTitles = getAvailableBooks();
        if (availableTitles.size() > 0) {
            System.out.printf("%-30s %-15s %6s %6s", "Title", "Author", "Year", "ID\n");
            System.out.printf("============================================================\n");
            for (int i = 0; i < availableTitles.size(); i++) {
                System.out.println(availableTitles.get(i).toString());
            }
        } else {
            System.out.println("No titles are available to check out! Please wait until someone returns a book.");
        }

    }

    public boolean checkoutBook(int ID) {
        for (Book availableBook : getAvailableBooks()) {
            if (availableBook.getDetails().getID() == ID) {
                for (Book catalogBook : this.getCatalogBooks()) {
                    if (catalogBook.getDetails().getID() == ID) {
                        catalogBook.checkOut();
                        return true;
                    }
                }
            }
        }
        System.out.println("That book is not available.");
        return false;
    }

    public boolean returnBook(int ID) {
        for (Book catalogBook : getCatalogBooks()) {
            if (catalogBook.isCheckedOut() && catalogBook.getDetails().getID() == ID) {
                catalogBook.checkIn();
                return true;
            }
        }
        System.out.println("That is not a valid book to return.");
        return false;
    }

    // Methods for Films

    public ArrayList<Film> getAvailableFilms() {
        ArrayList<Film> availableTitles = new ArrayList<Film>();
        for (Film film : this.catalogFilms) {
            if (!film.isCheckedOut()) {
                availableTitles.add(film);
            }
        }
        return availableTitles;
    }

    public void seeAllAvailableFilms() {
        ArrayList<Film> availableTitles = getAvailableFilms();
        if (availableTitles.size() > 0) {
            System.out.printf("%-30s %-6s %-25s %6s %6s", "Name", "Year", "Director", "Rating", "ID\n");
            System.out.printf("=============================================================================\n");
            for (int i = 0; i < availableTitles.size(); i++) {
                System.out.println(availableTitles.get(i).toString());
            }
        } else {
            System.out.println("No titles are available to check out! Please wait until someone returns a film.");
        }

    }

    public boolean checkoutFilm(int ID) {
        for (Film availableFilm : getAvailableFilms()) {
            if (availableFilm.getDetails().getID() == ID) {
                for (Film catalogFilm : this.getCatalogFilms()) {
                    if (catalogFilm.getDetails().getID() == ID) {
                        catalogFilm.checkOut();
                        return true;
                    }
                }
            }
        }
        System.out.println("That film is not available.");
        return false;
    }

    public boolean returnFilm(int ID) {
        for (Film catalogFilm : getCatalogFilms()) {
            if (catalogFilm.isCheckedOut() && catalogFilm.getDetails().getID() == ID) {
                catalogFilm.checkIn();
                return true;
            }
        }
        System.out.println("That is not a valid film to return.");
        return false;
    }

}
