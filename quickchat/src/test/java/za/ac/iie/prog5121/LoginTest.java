package za.ac.iie.prog5121;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testValidUsername() {
        Login login = new Login();
        assertTrue(login.isValidUsername("abc_"), "Username with underscore and <= 5 chars should be valid");
        assertFalse(login.isValidUsername("abcdef"), "Username too long should be invalid");
        assertFalse(login.isValidUsername("abcde"), "Username without underscore should be invalid");
    }

    @Test
    void testValidPassword() {
        Login login = new Login();
        assertTrue(login.isValidPassword("Passw0rd!"), "Password with length>=8, capital, number, special should be valid");
        assertFalse(login.isValidPassword("pass"), "Too short should be invalid");
        assertFalse(login.isValidPassword("password1"), "No capital or special should be invalid");
        assertFalse(login.isValidPassword("Password"), "No number or special should be invalid");
    }

    @Test
    void testValidCell() {
        Login login = new Login();
        assertTrue(login.isValidCell("+27123456789"), "Valid South African cell number with +27 should be valid");
        assertFalse(login.isValidCell("0123456789"), "Missing +27 should be invalid");
        assertFalse(login.isValidCell("+27123"), "Too short should be invalid");
    }

    @Test
    void testRegisterUserSuccess() {
        Login login = new Login();
        String message = login.registerUser("abc_", "Passw0rd!", "+27123456789", "John", "Doe");
        assertTrue(message.startsWith("Welcome"), "Should return welcome message on success");
    }

    @Test
    void testRegisterUserFailures() {
        Login login = new Login();
        assertTrue(login.registerUser("abcdef", "Passw0rd!", "+27123456789", "John", "Doe")
                .contains("Username is not correctly formatted"));
        assertTrue(login.registerUser("abc_", "password", "+27123456789", "John", "Doe")
                .contains("Password is not correctly formatted"));
        assertTrue(login.registerUser("abc_", "Passw0rd!", "12345", "John", "Doe")
                .contains("Cell number is incorrectly formatted"));
    }

    @Test
    void testLoginUser() {
        Login login = new Login();
        login.registerUser("abc_", "Passw0rd!", "+27123456789", "John", "Doe");

        assertTrue(login.loginUser("abc_", "Passw0rd!"), "Correct credentials should succeed");
        assertEquals("Login successful!", login.returnLoginStatus());

        assertFalse(login.loginUser("wrong", "Passw0rd!"), "Wrong username should fail");
        assertEquals("Login failed!", login.returnLoginStatus());
    }
}

