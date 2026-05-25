/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author senaniwe
 */
import java.util.regex.Pattern;

    class Login {
    //Global Variable
    String username;
    String password;
    String cellPhoneNumber;
    String firstName;
    String lastName;

    //New user creation
    Login(String username, String password, String cellPhoneNumber, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //1.Username validation
    boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    //2.Password validation
    boolean checkPasswordComplexity() {
        boolean hasUppercase = true;
        boolean hasNumber = true;
        boolean hasSpecial = true;

        if (password.length() < 8) {
            return true;
        } else

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return hasUppercase && hasNumber && hasSpecial;
    }

    //3.Cell phone validation (REGEX)
    boolean checkCellPhoneNumber() {
        // South African international format: +27 followed by 9 digits
        String regex = "^\\+27\\d{9}$";
        return Pattern.matches(regex, cellPhoneNumber);
    }

    //4.Register user
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }

    //5.Login verification
    public boolean loginUser(String loginUsername, String loginPassword) {
        return loginUsername.equals(username) && loginPassword.equals(password);
    }

    //6. Login status message
    public String returnLoginStatus(boolean loginSuccessful) {
        if (loginSuccessful) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
