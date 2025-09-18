package za.ac.iie.prog5121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testValidUsernameTrue() {
        Login login = new Login();
        assertTrue(login.isValidUsername("kyl_1"));
    }

    @Test
    void testValidUsernameFalse() {
        Login login = new Login();
        assertFalse(login.isValidUsername("kyle!!!!!!!"));
    }

    @Test
    void testValidPasswordTrue() {
        Login login = new Login();
        assertTrue(login.isValidPassword("Ch&&sec@ke99!"));
    }

    @Test
    void testValidPasswordFalse() {
        Login login = new Login();
        assertFalse(login.isValidPassword("password"));
    }

    @Test
    void testValidCellTrue() {
        Login login = new Login();
        assertTrue(login.isValidCell("+27838968976"));
    }

    @Test
    void testValidCellFalse() {
        Login login = new Login();
        assertFalse(login.isValidCell("08966553"));
    }

    @Test
    void testRegisterUserSuccess() {
        Login login = new Login();
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        assertEquals("Welcome John ,Doe it is great to see you.", result);
    }

    @Test
    void testRegisterUserInvalidUsername() {
        Login login = new Login();
        String result = login.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    @Test
    void testRegisterUserInvalidPassword() {
        Login login = new Login();
        String result = login.registerUser("kyl_1", "password", "+27838968976", "John", "Doe");
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
    }

    @Test
    void testRegisterUserInvalidCell() {
        Login login = new Login();
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "08966553", "John", "Doe");
        assertEquals("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.", result);
    }

    @Test
    void testLoginSuccess() {
        Login login = new Login();
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    void testLoginFail() {
        Login login = new Login();
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        assertFalse(login.loginUser("wrongUser", "wrongPass"));
    }
}
