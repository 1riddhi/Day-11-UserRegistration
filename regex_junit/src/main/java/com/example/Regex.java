package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{

    public static boolean isValidName(String name) throws CustomException {
        String regex = "^[A-Z][A-Za-z]{2,}$";

        if (!name.matches(regex)) {
            throw new CustomException("Invalid Name");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);


        return matcher.matches();
    }

    public static boolean isValidMobileNumber(String mobileNumber) throws CustomException{
        String regex = "^\\d{2} [6-9]\\d{9}$";

        if (!mobileNumber.matches(regex)) {
            throw new CustomException("Invalid Mobile Number");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) throws CustomException {
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}$";
        
        if (!password.matches(regex)) {
            throw new CustomException("Invalid Password");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isValidEmail(String email) throws CustomException{
        String regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        if (!email.matches(regex)) {
            throw new CustomException("Invalid Email");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
