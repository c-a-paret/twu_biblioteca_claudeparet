package com.twu.biblioteca;

public class UserAccount {

    // Fields
    private UserDetails details;
    private PIN security;


    // Constructor
    public UserAccount(String firstName, String surname, String email, String phone, int libraryNumber, int PIN) {
        this.details = new UserDetails(firstName, surname, email, phone, libraryNumber);
        this.security = new PIN(PIN);
    }


    // Getters
    public UserDetails getDetails() {
        return this.details;
    }

    public PIN getSecurity() {
        return this.security;
    }

    // security and Authorisation Methods




}
