package com.paul.email_service.controller;

import com.paul.email_service.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/retail/emails")
public class EmailController {

    @Autowired
    private EmailService service;


    @PostMapping("/send")
    public String sendEmail(
        @RequestParam String to,
        @RequestParam String subject,
        @RequestParam String body
    ){

        service.sendEmail(to, subject, body);
        return "Email sent to : "+to;
    }

    @GetMapping("home")
    public String home(){
        return "Welcome";
    }
}
