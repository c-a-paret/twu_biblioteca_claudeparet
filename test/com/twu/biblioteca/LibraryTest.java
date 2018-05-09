package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library testLibrary;

    @Before
    public void setUp() {
//        this.testBook = new Book("Title", "Author", 2000, 1234);
//        this.testFilm = new Film("FilmName", 2010, "FilmDirector", 10, 4321);
        this.testLibrary = new Library();
    }

    // Library BOOK catalog tests

    @Test
    public void testLibraryOpensWithThreeBooksInCatalog() {
        assertEquals(3, testLibrary.getCatalogBooks().size());
    }

    @Test
    public void testAllInitialBooksNotCheckedOut() {
        assertFalse(testLibrary.getCatalogBooks().get(0).isCheckedOut() &&
                testLibrary.getCatalogBooks().get(1).isCheckedOut() &&
                testLibrary.getCatalogBooks().get(2).isCheckedOut());
    }

    @Test
    public void testCheckoutBookInCatalog() {
        testLibrary.getCatalogBooks().get(0).checkOut();
        assertTrue(testLibrary.getCatalogBooks().get(0).isCheckedOut());
    }

    @Test
    public void testGetOnlyAvailableBooks() {
        assertEquals(3, testLibrary.getAvailableBooks().size());

        testLibrary.getCatalogBooks().get(0).checkOut();
        assertEquals(2, testLibrary.getAvailableBooks().size());

        testLibrary.getCatalogBooks().get(1).checkOut();
        assertEquals(1, testLibrary.getAvailableBooks().size());
    }

    @Test
    public void testSelectAndCheckoutBook() {
        testLibrary.checkoutBook(1234);
        assertTrue(testLibrary.getCatalogBooks().get(0).isCheckedOut());
    }

    @Test
    public void testBookNotAvailableAfterCheckout() {
        assertEquals(3, testLibrary.getAvailableBooks().size());
        testLibrary.checkoutBook(1234);
        assertEquals(2, testLibrary.getAvailableBooks().size());
    }

    @Test
    public void testCheckoutBookFails() {
        assertFalse(testLibrary.checkoutBook(9999));
    }

    @Test
    public void testReturnBookSuccessful() {
        testLibrary.checkoutBook(1234);
        assertTrue(testLibrary.getCatalogBooks().get(0).isCheckedOut());
        testLibrary.returnBook(1234);
        assertFalse(testLibrary.getCatalogBooks().get(0).isCheckedOut());
    }

    @Test
    public void testReturnBookFails() {
        assertFalse(testLibrary.returnBook(9999));
    }


    // Library FILM catalog tests

    @Test
    public void testLibraryOpensWithThreeFilmsInCatalog() {
        assertEquals(3, testLibrary.getCatalogFilms().size());
    }

    @Test
    public void testAllInitialFilmsNotCheckedOut() {
        assertFalse(testLibrary.getCatalogFilms().get(0).isCheckedOut() &&
                              testLibrary.getCatalogFilms().get(1).isCheckedOut() &&
                              testLibrary.getCatalogFilms().get(2).isCheckedOut());
    }

    @Test
    public void testCheckoutFilmInCatalog() {
        testLibrary.getCatalogFilms().get(0).checkOut();
        assertTrue(testLibrary.getCatalogFilms().get(0).isCheckedOut());
    }

    @Test
    public void testGetOnlyAvailableFilms() {
        assertEquals(3, testLibrary.getAvailableFilms().size());

        testLibrary.getCatalogFilms().get(0).checkOut();
        assertEquals(2, testLibrary.getAvailableFilms().size());

        testLibrary.getCatalogFilms().get(1).checkOut();
        assertEquals(1, testLibrary.getAvailableFilms().size());
    }

    @Test
    public void testSelectAndCheckoutFilm() {
        testLibrary.checkoutFilm(4321);
        assertTrue(testLibrary.getCatalogFilms().get(0).isCheckedOut());
    }

    @Test
    public void testFilmNotAvailableAfterCheckout() {
        assertEquals(3, testLibrary.getAvailableFilms().size());
        testLibrary.checkoutFilm(4321);
        assertEquals(2, testLibrary.getAvailableFilms().size());
    }

    @Test
    public void testCheckoutFilmFails() {
        assertFalse(testLibrary.checkoutFilm(9999));
    }

    @Test
    public void testReturnFilmSuccessful() {
        testLibrary.checkoutFilm(4321);
        assertTrue(testLibrary.getCatalogFilms().get(0).isCheckedOut());
        testLibrary.returnFilm(4321);
        assertFalse(testLibrary.getCatalogFilms().get(0).isCheckedOut());
    }

    @Test
    public void testReturnFilmFails() {
        assertFalse(testLibrary.returnFilm(9999));
    }
}