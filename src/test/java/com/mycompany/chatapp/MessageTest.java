/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;


import org.junit.jupiter.api.Test;

/**
 *
 * @author senan
 */
public class MessageTest {
    {}

    /**
     * Test of setMessageID method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetMessageID() {
        System.out.println("It is dinner time");
        String messageID = "0838884567";
        Message instance = new Message();
        instance.setMessageID(messageID); 
    }

    /**
     * Test of setRecipient method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetRecipient() {
        System.out.println("Where are you? You are late! I have asked you to be on time." + "Ok, I am leaving without you.");
        String recipient = "+27838884567";
        Message instance = new Message();
        instance.setRecipient(recipient);
    }

    /**
     * Test of setMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetMessage() {
        System.out.println("<>");
        String message = "<>";
        Message instance = new Message();
        instance.setMessage(message);
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckMessageID() {
        System.out.println("0838884567");
        Message instance = new Message();
        boolean expResult = false;
        boolean result = instance.checkMessageID();
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = new Message();
        String expResult = "hello";
        String result = instance.checkRecipientCell();      
    }

    /**
     * Test of checkMessageLength method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckMessageLength() {
        System.out.println("Where are you? You are late! I have asked you to be on time." );
        Message instance = new Message();
        String expResult = "message 1-4";
        String result = instance.checkMessageLength();     
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        int messageNumber = 0;
        Message instance = new Message();
        String expResult = "";
        String result = instance.createMessageHash(messageNumber);     
    }

    /**
     * Test of SentMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSentMessage() {
        System.out.println("Did you get the cake?" + "," + "It is dinner time!");
        int option = 0;
        Message instance = new Message();
        String expResult = "";
        String result = instance.SentMessage(option);    
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testStoreMessage() {
        System.out.println("<>");
        Message instance = new Message();
        instance.storeMessage();      
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Message instance = new Message();
        String expResult = "";
        String result = instance.printMessages();   
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
    }

    /**
     * Test of getMessageID method, of class Message.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getMessageID();
    }

    /**
     * Test of getMessageHash method, of class Message.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("Where are you? You are late! I have asked you to be on time.");
        Message instance = new Message();
        String expResult = "Test Message 2";
        String result = instance.getMessageHash();
    }

    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getMessage();
    }
    
}
