/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author senaniwe
 */
import java.util.Scanner;

public class ChatApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Registeration to App
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username (e.g. _username): ");
        String username = scanner.nextLine();

        System.out.print("Enter password (e.g. @pAss123): ");
        String password = scanner.nextLine();

        System.out.print("Enter cell phone number (e.g. +27831234567): ");
        String cellPhone = scanner.nextLine();

        Login login = new Login(username, password, cellPhone, firstName, lastName);

        System.out.println("\n" + login.registerUser());

        // Login to App
        System.out.println("\n--- LOGIN ---");

        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        boolean loginStatus = login.loginUser(loginUsername, loginPassword);
        System.out.println(login.returnLoginStatus(loginStatus));

        scanner.close();
    }
}
