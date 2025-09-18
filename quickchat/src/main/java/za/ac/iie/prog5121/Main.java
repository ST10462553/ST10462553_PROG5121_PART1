package za.ac.iie.prog5121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        // Register User
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter cell number (+27XXXXXXXXX): ");
        String cell = scanner.nextLine();

        String registrationMessage = login.registerUser(username, password, cell, firstName, lastName);
        System.out.println(registrationMessage);

        // Only allow login if registration was successful
        if (registrationMessage.contains("Welcome")) {
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            login.loginUser(loginUsername, loginPassword);
            System.out.println(login.returnLoginStatus());
        } else {
            System.out.println("Registration failed. Please try again.");
        }

        scanner.close();
    }
}
