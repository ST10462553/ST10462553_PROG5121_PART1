package za.ac.iie.prog5121;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

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

        // Register user
        String registrationMessage = login.registerUser(username, password, cell, firstName, lastName);
        System.out.println(registrationMessage);

        // Attempt login if registration was successful
        if (registrationMessage.startsWith("Welcome")) {
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            boolean loggedIn = login.loginUser(loginUsername, loginPassword);
            System.out.println(login.returnLoginStatus());
        }

        scanner.close();
    }
}
