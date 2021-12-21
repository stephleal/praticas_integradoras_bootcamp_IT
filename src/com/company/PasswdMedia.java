package com.company;

public class PasswdMedia extends Passwd{

    public PasswdMedia() {
        super("^(?=.*[A-Z].*[A-Z])(?=.*[a-z].*[a-z].*[a-z]).{8}$");
    }
}
