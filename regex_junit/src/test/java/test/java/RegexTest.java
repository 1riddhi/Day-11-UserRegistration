package test.java;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

import com.example.Regex;

public class RegexTest {
    @Test
    public void testValidFirstName() {
        assertTrue(Regex.isValidName("Riddhiii"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(Regex.isValidName("riddhi"));  
    }

    @Test
    public void testValidLastName() {
        assertTrue(Regex.isValidName("Prajapati"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(Regex.isValidName("Pr"));  
    }

    @Test
    public void testValidMobileNumber() {
        assertTrue(Regex.isValidMobileNumber("91 9876543210"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"9876543210", "1234567890", "1111111111"})
    public void testInvalidMobileNumber(String invalidMobileNumber) {
        assertFalse(Regex.isValidMobileNumber(invalidMobileNumber));
    }

    @Test
    public void testValidEmail() {
        assertTrue(Regex.isValidEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(Regex.isValidEmail("xyz.@com")); 
    }

    @Test
    public void testValidPassword() {
        assertTrue(Regex.isValidPassword("abcD12@efgh"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(Regex.isValidPassword("abcdefgh12"));
    }
}
