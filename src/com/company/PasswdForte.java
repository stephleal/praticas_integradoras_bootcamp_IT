package com.company;

public class PasswdForte extends Passwd{

    public PasswdForte() {
        super("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$");
    }
}
