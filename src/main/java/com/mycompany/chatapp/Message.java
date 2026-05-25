/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author senan
 */
import java.util.Random;
import java.io.FileWriter;

public class Message {

    private String messageID;
    private String recipient;
    private String message;
    private String messageHash;

    private static int totalMessagesSent = 0;

    // ===== SETTERS =====
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // ===== MESSAGE ID CHECK =====
    public boolean checkMessageID() {
        return messageID.length() <= 10;
    }

    // ===== RECIPIENT CHECK =====
    public String checkRecipientCell() {
        if (recipient.matches("^\\+27\\d{9}$")) {
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
    }

    // ===== MESSAGE LENGTH CHECK =====
    public String checkMessageLength() {
        if (message.length() <= 250) {
            return "Message ready to send.";
        }
        return "Message exceeds 250 characters by " + (message.length() - 250) + "; please reduce the size.";
    }

    // ===== MESSAGE HASH =====
    public String createMessageHash(int messageNumber) {

        String firstTwo = messageID.substring(0, 2);

        String[] words = message.split(" ");
        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();

        messageHash = firstTwo + ":" + messageNumber + ":" + firstWord + lastWord;
        return messageHash;
    }

    // ===== SEND / STORE / DISCARD =====
    public String SentMessage(int option) {

        switch (option) {
            case 1:
                totalMessagesSent++;
                return "Message successfully sent.";
            case 2:
                return "Press O to delete the message.";
            case 3:
                storeMessage();
                return "Message successfully stored.";
            default:
                return "Invalid option.";
        }
    }

    // ===== STORE MESSAGE (JSON) =====
public void storeMessage() {
    try {
        FileWriter writer = new FileWriter("messages.json", true);

        writer.write("{\n");
        writer.write("\"MessageID\": \"" + messageID + "\",\n");
        writer.write("\"MessageHash\": \"" + messageHash + "\",\n");
        writer.write("\"Recipient\": \"" + recipient + "\",\n");
        writer.write("\"Message\": \"" + message + "\"\n");
        writer.write("}\n");

        writer.close();

    } catch (Exception e) {
        System.out.println("Error saving message.");
    }
}

    // ===== PRINT MESSAGE =====
    public String printMessages() {
        return "Message ID: " + messageID +
               "\nMessage Hash: " + messageHash +
               "\nRecipient: " + recipient +
               "\nMessage: " + message;
    }

    // ===== TOTAL MESSAGES =====
    public static int returnTotalMessages() {
        return totalMessagesSent;
    }
}
