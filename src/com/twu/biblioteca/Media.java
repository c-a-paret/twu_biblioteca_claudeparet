package com.twu.biblioteca;

public abstract class Media {

    private boolean checkedOut;

    public Media() {
        this.checkedOut = false;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void checkOut() {
        this.checkedOut = true;
        System.out.println("Thank You! Enjoy!");
    }

    public void checkIn() {
        this.checkedOut = false;
        System.out.println("Thank you for returning the item.");
    }
}
