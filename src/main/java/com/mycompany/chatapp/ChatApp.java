/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author senaniwe
 */
import java.util.Scanner;
import java.util.Random;

public class ChatApp {
    
        // Arrays to store message data
        static String[] sentMessages = new String[10];
        static String[] storedMessages = new String[10];
        static String[] disregardedMessages = new String[10];
        static String[] messageIDs = new String[10];
        static String[] messageHashes = new String[10];

        // Counters
        static int sentCount = 0;
        static int storedCount = 0;
        static int discardCount = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== REGISTRATION ===== 
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter a 5 letter username beginning with an underscore eg.(_Sena): ");
        String username = scanner.nextLine();

        System.out.print("Enter a 8 letter password include\n");
        System.out.println("1 Special Character");
        System.out.println("Uppercase Letter");
        System.out.println("Numerical Letter");
        System.out.println("Example: eg(.P@a123): ");
        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter cell phone number eg.(+27...): ");
        String cellPhone = scanner.nextLine();

        Login login = new Login(username, password, cellPhone, firstName, lastName);
        System.out.println(login.registerUser());

        // ===== LOGIN =====
        System.out.println("\n--- LOGIN ---");
        System.out.print("Username: ");
        String loginUser = scanner.nextLine();

        System.out.print("Password: ");
        String loginPass = scanner.nextLine();

        if (!login.loginUser(loginUser, loginPass)) {
            System.out.println(login.returnLoginStatus(false));
            return;
        }

        System.out.println(login.returnLoginStatus(true));
        System.out.println("\nWelcome to QuickChat");

        // ===== MESSAGE SETUP =====
        System.out.print("\nHow many messages would you like to send? ");
        int numMessages = Integer.parseInt(scanner.nextLine());

        int messagesEntered = 0;
        boolean running = true;

        // ===== Menu loop =====
        while (running) {

           System.out.println("""
                1) Send Message
                2) Show Stored Messages
                3) Quit
                """);

            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    if (messagesEntered >= numMessages) {
                        System.out.println("Message limit reached.");
                        break;
                    }

                    // ===== CREATE MESSAGE =====
                    Message message = new Message();

                    // Auto-generate Message ID
                    String messageID = String.valueOf(new Random().nextInt(1000000000));
                    message.setMessageID(messageID);

                    System.out.print("Enter recipient number: ");
                    message.setRecipient(scanner.nextLine());
                    System.out.println(message.checkRecipientCell());

                    System.out.print("Enter message: ");
                    message.setMessage(scanner.nextLine());

                    // Check length
                    String lengthResult = message.checkMessageLength();
                    if (!lengthResult.equals("Message ready to send.")) {
                        System.out.println(lengthResult);
                        break;
                    }

                    // Create hash
                    message.createMessageHash(messagesEntered);

                    // ===== Send Options =====
                    System.out.println("""
                            1) Send Message
                            2) Disregard Message
                            3) Store Message
                            """);

                    System.out.print("Choose: ");
                    int sendOption = Integer.parseInt(scanner.nextLine());

                    String result = message.SentMessage(sendOption);
                    System.out.println(result);

                    if (sendOption == 1) {
                        sentMessages[sentCount] = message.getMessage();
                        messageIDs[sentCount] = message.getMessageID();
                        messageHashes[sentCount] = message.getMessageHash();
                        sentCount++;

                        System.out.println("\n--- MESSAGE DETAILS ---");
                        System.out.println(message.printMessages());

                    } else if (sendOption == 2) {
                        disregardedMessages[discardCount] = message.getMessage();
                        discardCount++;

                    } else if (sendOption == 3) {
                        storedMessages[storedCount] = message.getMessage();
                        storedCount++;
                    }
                    break;

                case 2:
                    showStoredMessages();
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        // ===== FINAL COUNT =====
        System.out.println("\nTotal messages sent: " + Message.returnTotalMessages());
        System.out.println("Goodbye!");
        scanner.close();
    }
        // ===== SHOW STORED MESSAGES =====
    public static void showStoredMessages() {
            if (storedCount == 0) {
                System.out.println("No stored messages.");
                return;
            }

            System.out.println("---- STORED MESSAGES ----");
            for (int i = 0; i < storedCount; i++) {
                System.out.println((i + 1) + ") " + storedMessages[i]);
            }
        }
    }