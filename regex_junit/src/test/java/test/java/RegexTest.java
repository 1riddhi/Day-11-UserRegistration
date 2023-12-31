package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

import com.example.CustomException;
import com.example.Regex;

public class RegexTest {

    @Test
    public void testValidFirstName() throws CustomException {
        assertTrue(Regex.isValidName("Riddhiii"));
    }

    @Test
    public void testInvalidFirstName() {
        try {
            Regex.isValidName("riddhi");
        } catch (CustomException e) {
            assertEquals("Invalid Name", e.getMessage());
        }
    }

    @Test
    public void testValidLastName() throws CustomException {
        assertTrue(Regex.isValidName("Prajapati"));
    }

    @Test
    public void testInvalidLastName() {
        try {
            Regex.isValidName("pr");
        } catch (CustomException e) {
            assertEquals("Invalid Name", e.getMessage());
        }
    }

    @Test
    public void testValidMobileNumber() throws CustomException {
        assertTrue(Regex.isValidMobileNumber("91 9876543210"));
    }

    @ParameterizedTest
    @ValueSource(strings = { "9876543210", "1234567890", "1111111111" })
    public void testInvalidMobileNumber(String invalidMobileNumber) throws CustomException {
        assertThrows(CustomException.class, () -> Regex.isValidMobileNumber(invalidMobileNumber));
    }

    @Test
    public void testValidEmail() throws CustomException{
        assertTrue(Regex.isValidEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() throws CustomException{
         assertThrows(CustomException.class, ()->Regex.isValidEmail("xyz.@com"));
    }

    @Test
    public void testValidPassword() throws CustomException{
        assertTrue(Regex.isValidPassword("abcD12@efgh"));
    }

    @Test
    public void testInvalidPassword() throws CustomException{
        assertThrows(CustomException.class, ()->Regex.isValidPassword("abcdefgh12"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com",
    })
    public void parameterizedTestValidEmail(String validEmail) throws CustomException{
        assertTrue(Regex.isValidEmail(validEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {
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
    })
    public void parameterizedTestInvalidEmail(String invalidEmail) throws CustomException{
        assertThrows(CustomException.class, ()->Regex.isValidEmail(invalidEmail));
    }
}
