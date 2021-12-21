package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwd {

    private String senha;
    private String regex;

    public String getValue() {
        return senha;
    }

    public void setValue(String value) throws Exception{
       if (value.matches(this.regex)){
           this.senha = value;
       } else {
           throw new Exception();
       }
    }

    public Passwd(String value) {
        this.regex = value;
    }

}
