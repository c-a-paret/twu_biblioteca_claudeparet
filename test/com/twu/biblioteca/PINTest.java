package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PINTest {

    private PIN testPIN;

    @Before
    public void setUp() {
        testPIN = new PIN(1234);
    }

    @Test
    public void testAuthoriseUserSuccess() {
        assertTrue(testPIN.authorise(1234));
    }

    @Test
    public void testAuthoriseUserFail() {
        assertFalse(testPIN.authorise(9999));
    }


}