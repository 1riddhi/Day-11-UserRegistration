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

        String lastName="Prajapati";
        pattern=Pattern.compile(regex);
        matcher= pattern.matcher(lastName);

        if (matcher.matches()) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name. Last name starts with Cap and has minimum 3 characters.");
        }

        String email1 = "abc.xyz@bl.co.in"; //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with   precise @ and . positions
        
        regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email1);

        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        String mobileNumber = "91 9919819801";
        regex = "^\\d{2} [6-9]\\d{9}$";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobileNumber);

        if (matcher.matches()) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number.");
        }

        String password = "Password";
        regex = "^.{8,}$";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password. Meets the minimum 8 characters requirement.");
        } else {
            System.out.println("Invalid password. Please enter a password with at least 8 characters.");
        }

        regex = "^(?=.*[A-Z]).{8,}$";
        password="abcDeFgh";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password. Meets the minimum 8 characters and at least 1 uppercase letter requirement.");
        } else {
            System.out.println("Invalid password. Please enter a password with at least 8 characters and atleast 1 uppercase letter.");
        }

        regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        password="abc12DeFgh";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password. Meets the minimum 8 characters, atleast 1 uppercase letter, atleast 1 digit requirement.");
        } else {
            System.out.println("Invalid password. Please enter a password with at least 8 characters,atleast 1 digit and  atleast 1 uppercase letter.");
        }


        regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}$";
        password="abc12De@Fgh";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password. Meets the minimum 8 characters, atleast 1 uppercase letter, atleast 1 digit, exact 1 special character requirement.");
        } else {
            System.out.println("Invalid password. Please enter a password with at least 8 characters,atleast 1 digit, atleast 1 uppercase letter,exact 1 special character.");
        }

        sampleEmailTest();


    }
    
    public static void sampleEmailTest(){
        String regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]{2,}\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        String[] emails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com",
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + ": " + (matcher.matches() ? "Valid" : "Invalid"));
        }
    }
}
