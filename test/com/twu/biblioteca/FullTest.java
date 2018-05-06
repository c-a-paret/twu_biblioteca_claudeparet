package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullTest {

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


}
