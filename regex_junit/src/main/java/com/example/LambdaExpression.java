package com.example;

import java.util.Scanner;

@FunctionalInterface
interface RegexInterface {
    boolean check(String regex) throws CustomException;
}

public class LambdaExpression {
    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);

        checkValidName(scanner);
        checkValidMobileNumber(scanner);
        checkValidPassword(scanner);
        checkValidEmail(scanner);

        scanner.close();
    }

    public static void checkValidName(Scanner scanner) throws CustomException {
        System.out.print("Enter name: ");
        String userInput = scanner.nextLine();

        // Lambda expression
        RegexInterface isValidName = input -> Regex.isValidName(input);

        boolean resultName = isValidName.check(userInput);
        System.out.println("isValidName " + userInput + ": " + resultName);
    }

    public static void checkValidMobileNumber(Scanner scanner) throws CustomException {
        System.out.print("Enter mobile number: ");
        String userInput = scanner.nextLine();

        // Lambda expression
        RegexInterface isValidMobileNumber = input -> Regex.isValidMobileNumber(input);

        boolean resultMobileNumber = isValidMobileNumber.check(userInput);
        System.out.println("isValidMobileNumber " + userInput + ": " + resultMobileNumber);
    }

    public static void checkValidPassword(Scanner scanner) throws CustomException {
        System.out.print("Enter password: ");
        String userInput = scanner.nextLine();

        // Lambda expression
        RegexInterface isValidPassword = input -> Regex.isValidPassword(input);

        boolean resultPassword = isValidPassword.check(userInput);
        System.out.println("isValidPassword " + userInput + ": " + resultPassword);
    }

    public static void checkValidEmail(Scanner scanner) throws CustomException {
        System.out.print("Enter email: ");
        String userInput = scanner.nextLine();

        // Lambda expression
        RegexInterface isValidEmail = input -> Regex.isValidEmail(input);

        boolean resultEmail = isValidEmail.check(userInput);
        System.out.println("isValidEmail " + userInput + ": " + resultEmail);
    }
}
