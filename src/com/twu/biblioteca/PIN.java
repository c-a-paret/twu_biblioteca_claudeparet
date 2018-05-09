package com.twu.biblioteca;

public class PIN {

    private final int savedPin;

    public PIN(int PIN) {
        this.savedPin = encrypt(PIN);
    }

    private int encrypt(int passedPIN) {
        return (passedPIN * 42) + 3;
    }

    private int decrpyt() {
        return (this.savedPin - 3) / 42;
    }

    public boolean authorise(int userPIN) {
        if (userPIN == decrpyt()) {
            return true;
        }
        return false;
    }
}
