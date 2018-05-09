package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountTest {

    UserAccount testUser;

    @Before
    public void setUp() {
        this.testUser = new UserAccount("First_Name", "Surname", "example@domain.com", "07123456789", 1234567, 1234);
    }

    @Test
    public void testUserAccountDetailsInitialiseCorrectly() {
        assertTrue(testUser.getDetails().getFirstName().equals("First_Name") &&
                            testUser.getDetails().getSurname().equals("Surname") &&
                            testUser.getDetails().getEmail().equals("example@domain.com") &&
                            testUser.getDetails().getPhone().equals("07123456789") &&
                            testUser.getDetails().getLibraryNumber() == 1234567);
    }

    @Test
    public void testUserAccountAuthoriseSuccess() {
        assertTrue(testUser.authorise(1234));
    }

    @Test
    public void testUserAccountAuthoriseFailure() {
        assertFalse(testUser.authorise(9999));
    }

}