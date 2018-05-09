package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountTest {

    UserAccount testUser;

    @Before
    public void setUp() {
        this.testUser = new UserAccount("First_Name", "Surname", 1234567, 1234);
    }

    @Test
    public void testUserAccountDetailsInitialiseCorrectly() {
        assertTrue(testUser.getFirstName().equals("First_Name") &&
                            testUser.getSurname().equals("Surname") &&
                            testUser.getLibraryNumber() == 1234567);
    }

}