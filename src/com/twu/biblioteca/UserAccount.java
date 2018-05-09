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

    private PIN getSecurity() {
        return this.security;
    }

    // Methods
    public boolean authorise(int PIN) {
        return this.getSecurity().authorise(PIN);
    }



}
