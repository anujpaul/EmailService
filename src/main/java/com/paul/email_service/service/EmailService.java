package com.paul.email_service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
     private JavaMailSender mailSender;

public void sendEmail(String to, String subject, String body){

    SimpleMailMessage simpleMessage = new SimpleMailMessage();

    simpleMessage.setTo(to);
    simpleMessage.setSubject(subject);
    simpleMessage.setText(body);
    mailSender.send(simpleMessage);
}
}
