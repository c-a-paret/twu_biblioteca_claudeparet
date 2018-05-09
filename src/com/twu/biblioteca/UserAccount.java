package com.twu.biblioteca;

public class UserAccount {

    // Fields
    private String firstName;
    private String surname;
    private int libraryNumber;
    private int PIN;


    // Constructor
    public UserAccount(String firstName, String surname, int libraryNumber, int PIN) {
        this.firstName = firstName;
        this.surname = surname;
        this.libraryNumber = libraryNumber;
        this.PIN = PIN;
    }


    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getLibraryNumber() {
        return this.libraryNumber;
    }
}
