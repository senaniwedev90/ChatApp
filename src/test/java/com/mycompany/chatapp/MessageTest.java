/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author senan
 */
public class MessageTest {
    {
        }

    /**
     * Test of setMessageID method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetMessageID() {
        System.out.println("setMessageID");
        String messageID = "Hello";
        Message instance = new Message();
        instance.setMessageID(messageID);
        
    }

    /**
     * Test of setRecipient method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        String recipient = "<>";
        Message instance = new Message();
        instance.setRecipient(recipient);
    }

    /**
     * Test of setMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "Hello";
        Message instance = new Message();
        instance.setMessage(message);
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = new Message();
        boolean expResult = false;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = new Message();
        String expResult = "";
        String result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkMessageLength method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        Message instance = new Message();
        String expResult = "";
        String result = instance.checkMessageLength();
        assertEquals(expResult, result);
        
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SentMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testSentMessage() {
        System.out.println("SentMessage");
        int option = 0;
        Message instance = new Message();
        String expResult = "";
        String result = instance.SentMessage(option);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
    }
    
}
