package com.codermaycry.dip;

public class EmailSender {
    private final String smtpServer;

    public EmailSender(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public void send(Email email) {
        var sendEmail = String.format("To: %s, Subject: %s, Message: %s Using SMTP Server %s", email.to(), email.subject(), email.message(), smtpServer);
        System.out.print(sendEmail);
    }
}
