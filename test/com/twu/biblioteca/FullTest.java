package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullTest {

    // Book Tests

    Book testBook;

    @Before
    public void setUp() {
        this.testBook = new Book("Title", "Author", 2000);
    }

    @Test
    public void testNewBookReturnsBookObject() {
        assertNotNull(testBook);
    }

    @Test
    public void testBooksAreEqual() {
        Book comparisonBook = new Book("Title", "Author", 2000);
        assertTrue(testBook.equals(comparisonBook));
    }

    @Test
    public void testBooksAreNotEqual() {
        Book comparisonBook = new Book("Title2", "Author2", 2001);
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

    @Test
    public void testBookCheckedInFailure() {
        assertFalse(testBook.checkIn());
    }



    // Library Tests

    @Test
    public void testLibraryOpensWithThreeBooksOnShelf() {
        Library testLibrary = new Library();
        assertEquals(3, testLibrary.shelf.size());
    }


}
