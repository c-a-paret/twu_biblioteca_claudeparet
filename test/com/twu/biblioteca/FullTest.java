package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullTest {

    private Book testBook;
    private Film testFilm;
    private Library testLibrary;

    @Before
    public void setUp() {
        this.testBook = new Book("Title", "Author", 2000, 1234);
        this.testFilm = new Film("FilmName", 2010, "FilmDirector", 10, 4321);
        this.testLibrary = new Library();
    }

    // Book Tests
    @Test
    public void testNewBookReturnsBookObject() {
        assertNotNull(testBook);
    }

    @Test
    public void testBooksAreEqual() {
        Book comparisonBook = new Book("Title", "Author", 2000, 1234);
        assertTrue(testBook.equals(comparisonBook));
    }

    @Test
    public void testBooksAreNotEqual() {
        Book comparisonBook = new Book("Title2", "Author2", 2001, 4321);
        assertFalse(testBook.equals(comparisonBook));
    }

    @Test
    public void testGetDetailsSucceeds() {
        assertTrue(testBook.getDetails().getTitle().equals("Title"));
        assertTrue(testBook.getDetails().getAuthor().equals("Author"));
        assertEquals(2000, testBook.getDetails().getYear());
    }

    @Test
    public void testBookNotCheckedOut() {
        assertFalse(testBook.isCheckedOut());
    }

    @Test
    public void testBookCheckedOutSuccess() {
        testBook.checkOut();
        assertTrue(testBook.isCheckedOut());
    }

    // Film Tests
    @Test
    public void testNewFilmReturnsFilmObject() {
        assertNotNull(testFilm);
    }

    @Test
    public void testFilmsAreEqual() {
        Film comparisonFilm = new Film("FilmName", 2010, "FilmDirector", 10, 4321);
        assertTrue(testFilm.equals(comparisonFilm));
    }

    @Test
    public void testFilmsAreNotEqual() {
        Film comparisonFilm = new Film("FilmName", 2010, "FilmDirector", 10, 1234);
        assertFalse(testFilm.equals(comparisonFilm));
    }

    @Test
    public void testGetFilmDetailsSucceeds() {
        assertTrue(testFilm.getDetails().getTitle().equals("FilmName"));
        assertTrue(testFilm.getDetails().getDirector().equals("FilmDirector"));
        assertEquals(2010, testFilm.getDetails().getYear());
    }

    @Test
    public void testFilmNotCheckedOut() {
        assertFalse(testFilm.isCheckedOut());
    }

    @Test
    public void testFilmCheckedOutSuccess() {
        testFilm.checkOut();
        assertTrue(testFilm.isCheckedOut());
    }
}
