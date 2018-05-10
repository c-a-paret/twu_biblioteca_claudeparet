package com.twu.biblioteca;

public abstract class Media {

    private boolean checkedOut;
    private int checkedOutUser = 0;

    public Media() {
        this.checkedOut = false;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void checkOut(int checkedOutUserLibraryNumber) {
        this.checkedOut = true;
        this.checkedOutUser = checkedOutUserLibraryNumber;
        System.out.println("Thank You! Enjoy!");
    }

    public void checkIn() {
        this.checkedOut = false;
        this.checkedOutUser = 0;
        System.out.println("Thank you for returning the item.");
    }


    public int whoHasCheckOut() {
        return this.checkedOutUser;
    }
}
