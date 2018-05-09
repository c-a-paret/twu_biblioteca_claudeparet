package com.twu.biblioteca;

public class Details {

    private String title;
    private int year;
    private int ID;

    public Details(String title, int year, int ID) {
        this.title = title;
        this.year = year;
        this.ID = ID;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public int getID() {
        return this.ID;
    }
}
