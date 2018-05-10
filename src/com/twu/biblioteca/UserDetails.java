package com.twu.biblioteca;

public class UserDetails {

    private String firstName;
    private String surname;
    private String email;
    private String phone;
    private final int libraryNumber;

    public UserDetails(String firstName, String surname, String email, String phone, int libraryNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.libraryNumber = libraryNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getLibraryNumber() {
        return this.libraryNumber;
    }

    @Override
    public String toString() {
        return String.format("\nAccount Details\n------------------------------\n" + getFirstName().toUpperCase() + " " + getSurname().toUpperCase() + "\n%-7s %-20s\n%-7s %-20s", "Email:", getEmail(), "Phone:", getPhone());
    }
}
