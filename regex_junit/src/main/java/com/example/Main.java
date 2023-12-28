package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        
        String regex="^[A-Z][A-Za-z]{2,}$";
        String firstName="Riddhi";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(firstName);


        if (matcher.matches()) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name. First name starts with Cap and has minimum 3 characters.");
        }
    }
}