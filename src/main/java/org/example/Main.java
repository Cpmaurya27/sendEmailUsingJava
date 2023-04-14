package org.example;

public class Main {
    public static void main(String[] args) {

        //prepare to send mail
        System.out.println("This application for send the mail");

        //message to be sent in the mail body



        //senders mail
        String senderMailId = "cpmaurya25@gmail.com";
        HandlerEmail mailer = new HandlerEmail();
        mailer.sendAttachment();

    }
}