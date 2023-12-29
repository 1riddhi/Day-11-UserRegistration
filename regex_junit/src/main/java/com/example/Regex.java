package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{
    public static boolean isValidName(String name) {
        String regex = "^[A-Z][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        String regex = "^\\d{2} [6-9]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]*[!@#$%^&*()_=+-][a-zA-Z\\d]*{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]{2,}\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
