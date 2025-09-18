package za.ac.iie.prog5121;

public class Login {

    private String registeredUsername;
    private String registeredPassword;
    private String registeredCell;
    private String firstName;
    private String lastName;
    private boolean lastLoginSuccessful;

    // Username Validation
    public boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password Validation
    public boolean isValidPassword(String password) {
        boolean length = password.length() >= 8;
        boolean capital = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        return length && capital && number && special;
    }

    // Cell Number Validation
    public boolean isValidCell(String cell) {
        return cell.startsWith("+27") && cell.length() == 12;
    }

    // Register User
    public String registerUser(String username, String password, String cell, String firstName, String lastName) {
        if (!isValidUsername(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!isValidPassword(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!isValidCell(cell)) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }

        this.registeredUsername = username;
        this.registeredPassword = password;
        this.registeredCell = cell;
        this.firstName = firstName;
        this.lastName = lastName;

        return "Welcome " + firstName + " ," + lastName + " it is great to see you.";
    }

    // Login User
    public boolean loginUser(String username, String password) {
        lastLoginSuccessful = username.equals(registeredUsername) && password.equals(registeredPassword);
        return lastLoginSuccessful;
    }

    // Return Login Status
    public String returnLoginStatus() {
        return lastLoginSuccessful ? "Login successful!" : "Login failed. Please check your username and password.";
    }
}
