package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullTest {

    // Book Tests

    Book testBook;

    @Before
    public void setUp() {
        this.testBook = new Book("Title", "Author", 2000, 1234);
    }

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



    // Library Tests

    // TODO: 07/05/2018 Make BEFORE for Library object

    @Test
    public void testLibraryOpensWithThreeBooksOnShelf() {
        Library testLibrary = new Library();
        assertEquals(3, testLibrary.getCatalog().size());
    }

    @Test
    public void testAllInitialBooksNotCheckedOut() {
        Library testLibrary = new Library();
        assertFalse(testLibrary.getCatalog().get(0).isCheckedOut() &&
                             testLibrary.getCatalog().get(1).isCheckedOut() &&
                             testLibrary.getCatalog().get(2).isCheckedOut());
    }


    @Test
    public void testCheckoutBookInCatalog() {
        Library testLibrary = new Library();
        testLibrary.getCatalog().get(0).checkOut();
        assertTrue(testLibrary.getCatalog().get(0).isCheckedOut());
    }


    @Test
    public void testGetOnlyAvailableBooks() {
        Library testLibrary = new Library();

        assertEquals(3, testLibrary.getAvailableBooks().size());

        testLibrary.getCatalog().get(0).checkOut();
        assertEquals(2, testLibrary.getAvailableBooks().size());

        testLibrary.getCatalog().get(1).checkOut();
        assertEquals(1, testLibrary.getAvailableBooks().size());
    }

    @Test
    public void testSelectAndCheckoutBook() {
        Library testLibrary = new Library();
        testLibrary.checkoutBook(1234);
        assertTrue(testLibrary.getCatalog().get(0).isCheckedOut());
    }

    @Test
    public void testBookNotAvailableAfterCheckout() {
        Library testLibrary = new Library();
        assertEquals(3, testLibrary.getAvailableBooks().size());
        testLibrary.checkoutBook(1234);
        assertEquals(2, testLibrary.getAvailableBooks().size());
    }

    @Test
    public void testCheckoutBookFails() {
        Library testLibrary = new Library();
        assertFalse(testLibrary.checkoutBook(9999));
    }

    @Test
    public void testReturnBookSuccessful() {
        Library testLibrary = new Library();
        testLibrary.checkoutBook(1234);
        assertTrue(testLibrary.getCatalog().get(0).isCheckedOut());
        testLibrary.returnBook(1234);
        assertFalse(testLibrary.getCatalog().get(0).isCheckedOut());
    }

    @Test
    public void testReturnBookFails() {
        Library testLibrary = new Library();
        assertFalse(testLibrary.returnBook(9999));
    }


}
